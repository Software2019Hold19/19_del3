package GameBoard;

public class VisitingField extends Field {

    public VisitingField(String name, String subName, String desc, String type){
        super(name, subName, desc, type);
    }

    @Override
    public String[] getInfo() {
        String[] info = new String[]{getName(), getSubName(), getDesc(), getType()};
        return info;
    }

}
