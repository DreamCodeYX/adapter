package adapetr;

public class WeiBShare implements Share{
    private static final String NAME = "789";
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WeiBShare;
    }

    @Override
    public void ShareToArray(String  key) {
        if(NAME.equals(key)){
            System.out.println("微博分享");
        }

    }
}
