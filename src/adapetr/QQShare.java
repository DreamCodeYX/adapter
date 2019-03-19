package adapetr;

public class QQShare implements Share{
    private static final String NAME = "123";
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  QQShare;
    }

    public void ShareToArray(String  key){
        if(NAME.equals(key)){
            System.out.println("通过QQ分享");
        }
    }
}
