package adapetr;

public class ShareThird implements IPassportForThird {
    @Override
    public void QQShare(String  qq) {
        isThisClass(qq,QQShare.class);
    }

    @Override
    public void WeiBShare(String weiB) {
        isThisClass(weiB,WeiBShare.class);
    }

    @Override
    public void WecharShare(String wechar) {
        isThisClass(wechar,WecharShare.class);

    }


    private void isThisClass(String key ,Class<? extends  Share> clazz){
        try {
            Share share = clazz.newInstance();
            if(share.support(share)){
                    share.ShareToArray(key);
                    return;
            }
            System.out.println("null");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
