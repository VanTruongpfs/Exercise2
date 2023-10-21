package exercise23;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Image {
	private int width;
	private int height;
	private String source;
	private String quality;
/**
 * this is constructor of Image
 * @param width
 * @param height
 * @param source
 * @param quality
 * example:
 * 	new Image(10, 5, "small.gif", "low");
 * 	new Image(120, 200, "med.gif", "low");
 * 	new Image(1200, 1000, "large.gif", "high");
 */
public Image(int width, int height, String source, String quality) {
	this.width = width;
	this.height = height;
	this.source = source;
	this.quality = quality;
}
/**
 * this is method
 * @return
 * example:
 * 	Image i1 = new Image(5, 10, "small.gif", "low");
 * 	Image i2 = new Image(200, 120, "med.gif", "low");
 * 	Image i3 = new Image(1000, 1200, "large.gif", "high");
 * 
 * this is method isPortrait()
 * 	assertTrue(i1.isPortrait());
 * 	assertFalse(i2.isPortrait());
 * 	assertTrue(i3.isPortrait());
 * 
 * this is method size()
 *  assertEquals(i1.size(),50);
 *  assertEquals(i2.size(),24000);
 *  assertEquals(i3.size(),1200000);
 *  
 *  this is method isLarger()
 *   assertFalse(i1.isLarger(i2)); 
 *   assertTrue(i3.isLarger(i2)); 
 *   assertTrue(i3.isLarger(i1)); 
 *   
 *  this is method same()
 *   assertFalse(i1.same(i2));	(i1 different with i2)=>true
 *   assertFalse(i1.same(i3));	(i1 different with i3)=>true
 *   assertFalse(i3.same(i2));	(i3 different with i2)=>true
 *   
 */
//	determines whether the image’s height is larger than its width
	public boolean isPortrait() {
		return this.height > this.width;
	}
//	which computes how many pixels the image contains;
	public double size() {
		return this.height*this.width;
	}
//	check whether one image contains more pixels than some other image;
	public boolean isLarger(Image other) {
		return this.size() > other.size();
	}
//	determines whether this image is the same as a given one.
	public boolean same(Object obj) {
		if(null == obj || !(obj instanceof Image))
			return false;
		else{Image that = (Image) obj;
			return this.height == that.height
			&& this.width == that.width
			&& this.source.equals(source)
			&& this.quality.equals(quality);
	}
	}
	public String sizeString() {
		if(this.size()<=10000) {
			return "small";
		}else if (this.size()>=10001 && this.size()<= 1000000) {
			return "medium";
		} else {
			return "larger";
		}
	

}
}