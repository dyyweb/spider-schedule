package tf56.spider.schedule.listener;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * rocketmq consumer message listener
 * 
 * @author shaoben
 * @data 2016-03-27
 */
@Service
public class MessageListener implements MessageListenerConcurrently {

	private static final Logger logger = LoggerFactory .getLogger(MessageListener.class);


	@Override
	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
			ConsumeConcurrentlyContext context) {
		Message msg = msgs.get(0);
		String body = null;
		try {
//			body = new String(msg.getBody(), "utf-8");

			
		} catch (Exception e) {
			logger.error("consumeMessage error, msg=" + msg.toString(), e);
		}
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}

}
