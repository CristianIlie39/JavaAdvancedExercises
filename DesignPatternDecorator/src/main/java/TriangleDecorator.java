public class TriangleDecorator extends ShapeDecorator {

    public TriangleDecorator(Shape shapeToDecorate) {
        super(shapeToDecorate); //am apelat constructorul din clasa parinte ca sa-i dau atributul shapeToDecorate
    }

    @Override
    public void draw() {
        shapeToDecorate.draw();
        System.out.println("I have a border."); //am adaugat border
    }
}
