package com.doctor.dsruptor330;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;

/**
 * see https://github.com/LMAX-Exchange/disruptor/wiki/Getting-Started
 * 
 * @author doctor
 *
 * @time   2014年10月30日 上午10:32:08
 */

public class GettingStarted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static class LongEvnet {
		private long value;

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
		
	}
	
	public static class LongEventFactory implements EventFactory<LongEvnet>{

		@Override
		public LongEvnet newInstance() {
			return new LongEvnet();
		}
		
	}
	
	public static class LongEventHandler implements EventHandler<LongEvnet>{

		@Override
		public void onEvent(LongEvnet event, long sequence, boolean endOfBatch) throws Exception {
			System.out.println("LongEvnet : " + event);
			
		}
		
	}
}
