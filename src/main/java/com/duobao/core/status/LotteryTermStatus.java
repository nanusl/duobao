package com.duobao.core.status;

public enum LotteryTermStatus implements IntEnum<LotteryTermStatus> {
	NOT_OPEN(0, "未开奖"), NOT_AWARD(1, "未中奖"), AWARD(1, "已中奖");
	private int index;
	private String name;

	private LotteryTermStatus(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String fromIndex(int index) {
		for (LotteryTermStatus p : LotteryTermStatus.values()) {
			if (index == p.getValue())
				return p.name;
		}
		return null;
	}

	public int getValue() {		
		return this.index;
	}

	public String getName(){
		return this.name();
	}
}
