package GameBoard;

public class GoToJailField extends Field {

    public GoToJailField(String name, String subName, String desc, String type){
        super(name, type, subName, desc);
    }

    public void landOnField(){

    }

    @Override
    public String[] getInfo() {
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType()};
        return info;
    }
}
