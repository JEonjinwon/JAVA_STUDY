package f_OOP2;

public class TimeTest {
	/*
	 * 시간 40시간 -> 16 분 200분 -> 19:20 초 10000초 -> 22:6:40
	 * 
	 * 시간 22시간 -> 22 분 100분 -> 22:40 초 10000초 -> 2:26:40
	 */

	public static void main(String[] args) {
		TimeVO t = new TimeVO();
		// 사용자가 10시간을 입력 0~23
		t.setHour(40);
		t.setMinute(200);
		t.setSecond(10000);
		int hour = t.getHour();
		int minute = t.getMinute();
		int second = t.getSecond();
		System.out.println(hour + "시" + minute + "분" + second + "초");
		t.setHour(22);
		t.setMinute(100);
		t.setSecond(10000);
		int hour2 = t.getHour();
		int minute2 = t.getMinute();
		int second2 = t.getSecond();
		System.out.println(hour2 + "시" + minute2 + "분" + second2 + "초");
	}
}

class TimeVO {
	private int hour;
	private int minute;
	private int second;

	void setHour(int hour) {
		this.hour = hour % 24;
	}

	int getHour() {
		return hour;
	}

	void setMinute(int minute) {
		setHour(hour += minute / 60);
		this.minute = minute % 60;
	}

	int getMinute() {
		return minute;
	}

	void setSecond(int second) {
		setMinute(minute += second / 60);
		this.second = second % 60;

	}

	int getSecond() {
		return second;
	}
}
