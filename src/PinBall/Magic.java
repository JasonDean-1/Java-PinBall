package PinBall;

import java.io.IOException;

public abstract class Magic extends BallComponent
{
	/**
	 * 提供给子类调用的构造器
	 * 
	 * @param path
	 *            String 文件路径
	 * @param x
	 *            int x坐标
	 * @param y
	 *            int y坐标
	 */
	public Magic(String path, int x, int y) throws IOException
	{
		super(path, x, y);
	}

	/**
	 * 道具的功能
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public abstract void magicDo(Stick stick);
}