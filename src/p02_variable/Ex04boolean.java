package p02_variable;

public class Ex04boolean {
  public static void main(String[] args) {
    Television tv = new Television();
    tv.power();
    tv.channel(26);
    tv.volume(12);
  }
}

class Television {
  boolean power = true;
  int channel;
  int volume;

  boolean channelUp = false;
  boolean channelDown = false;

  boolean volumeUp = false;
  boolean volumeDown = false;

  void power() {
//    if (power == true) {
//      System.out.println("전원켜짐");
//    } else {
//      System.out.println("전원꺼짐");
//    }
    System.out.println(power ? "전원 ON" : "전원 OFF");
  }

  void channel(int channel) {
    this.channel = channel;
    channel = channelUp ? channel + 1 : channel + 0;
    channel = channelDown ? channel - 1 : channel + 0;
    if (power == true) {
      System.out.println("Ch." + channel);
    }
  }

  void volume(int volume) {
    this.volume = volume;
    volume = volumeUp ? volume+1 : volume+0;
    volume = volumeDown ? volume-1 : volume+0;
    if (power == true) {
      System.out.println("Vol." + volume);
    }
  }
}

