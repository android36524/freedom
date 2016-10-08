package freedom.nio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NioHandler implements IoHandler {

	@Override
	public void connected(IoSession session, Object msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void received(IoSession session, Object msg)
	{
		// TODO Auto-generated method stub
		//System.out.println(String.format("%d session handler message : %s", session.getId(),msg));
		try {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("name", "张三");
			map.put("age", 10);
			session.write(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void disconnected(IoSession session, Object msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void idle(IoSession session, Object msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(IoSession session, Object msg) {
		// TODO Auto-generated method stub

	}

}
