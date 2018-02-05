package prototype;
import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeTable = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeTable.get(shapeId);
		return (Shape)cacheShape.clone();
	}
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeTable.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeTable.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeTable.put(rectangle.getId(), rectangle);
	}
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		System.out.println(shapeTable.get("1"));
		Shape cloneShape1 = ShapeCache.getShape("1");
		System.out.println(cloneShape1.getType());
		System.out.println(cloneShape1);
//		Shape cloneShape2 = ShapeCache.getShape("2");
//		cloneShape2.draw();
//		Shape cloneShape3 = ShapeCache.getShape("3");
//		cloneShape3.draw();
		
		
	}
}
