package Buoi2.Assignment;
class TV{
    int channel = 25 ;  // the current channel (1-120) of this TV
    int volumeLevel = 4; // the current volume (1-7) of this TV
    boolean on;  // indicates whether this tv is on/off

    public void turnOn(){
        this.on =true;
    }
    public void turnOff(){
        this.on =false;
    }
    public void setChannel(int newChannel){
        if(newChannel > 120 || newChannel < 1){
            System.out.println("TV không có kênh này");
        }
        else {
            this.channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if(newVolumeLevel > 7 || newVolumeLevel < 1 ){
            System.out.println("Âm lượng tối đa là 7 và nhỏ nhất là 1");
        }
        else {
            this.volumeLevel = newVolumeLevel;
        }
    }
    public void chanelUp(){
        this.channel ++;
        if(this.channel > 120){
            System.out.println("TV không có kênh này, TV chỉ có kênh 1-120");
            this.channel -- ;
        }
    }
    public void chanelDown(){
        this.channel --;
        if(this.channel < 1){
            System.out.println("TV không có kênh này, TV chỉ có kênh 1-120");
            this.channel ++ ;
        }

    }
    public void volumeUp(){
        this.volumeLevel ++;
        if(this.volumeLevel > 7){
            System.out.println("Âm lượng đã đạt tối đa");
            this.volumeLevel -- ;
        }
    }
    public void volumeDown(){
        this.volumeLevel --;
        if(this.volumeLevel < 1){
            System.out.println("Âm lượng đã nhỏ nhất ");
            this.volumeLevel ++ ;
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
public class Bai2 {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println("Ban đầu\n" + tv.toString());
        tv.turnOn(); // bật tivi
        tv.setChannel(25); // đặt kênh là 8
        tv.setVolume(6); // đặt âm lượng là 7
        System.out.println();
        System.out.println("Sau khi set channel = 8, set volume = 7\n" + tv.toString());
        tv.chanelDown(); // lùi đi 1 kênh
        tv.volumeDown(); // giảm âm lượng đi 1
        System.out.println();
        System.out.println("Sau khi giảm channel và giảm volume: \n" + tv.toString());
        tv.chanelUp(); // tăng lên 1 kênh
        tv.volumeUp(); // tăng âm lượng  lên đi 1
        System.out.println();
        System.out.println("Sau khi tăng channel và tăng volume: \n" + tv.toString()+"\n");



        // trong trường hợp vượt quá kênh và hoặc volume
        System.out.println("Trường hợp đặc biệt 1 ");
        tv.setChannel(122); // print ra TV không có kênh này"
        tv.setChannel(-2); // print ra TV không có kênh này"
        tv.setVolume(8); // print ra "Âm lượng tối đa là 7 và nhỏ nhất là 1"
        tv.setVolume(-2);// print ra "Âm lượng tối đa là 7 và nhỏ nhất là 1"
        tv.setChannel(120);
        tv.setVolume(7);
        tv.chanelUp(); // do kênh đang là 120 up lên 121 thì không hợp lệ nên print ra "TV không có kênh này, TV chỉ có kênh 1-120"
        tv.volumeUp();// do âm lượng đang đạt tối đa là 7 nên up lên tiếp sẽ print ra "Âm lượng đã đạt tối đa"
        System.out.println(tv.toString()+"\n");
        System.out.println("Trường hợp đặc biệt 2 ");
        tv.setVolume(1);
        tv.setChannel(1);
        tv.volumeDown();// do kênh đang là 1 nên down xuống thì không hợp lệ nên print ra "TV không có kênh này, TV chỉ có kênh 1-120"
        tv.chanelDown();// do âm lượng đang đạt tối thiểu là 1 nên down xuống tiếp sẽ print ra "Âm lượng đã nhỏ nhất "
        System.out.println(tv.toString()+"\n");
        tv.turnOff();// tắt tivi
    }
}
