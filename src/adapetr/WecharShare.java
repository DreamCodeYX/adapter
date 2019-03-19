package adapetr;

public class WecharShare  implements Share{
    private static final String NAME = "456";
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  WecharShare;
    }

    @Override
    public void ShareToArray(String  key) {
        if(NAME.equals(key)){
            System.out.println("微信分享");
        }
    }
}
