package algorithms.IDA;
import java.io.File;
import java.io.FilenameFilter;

/*file extension filter.
 * filter files with extension: 'splt'
 * 
 */
public class Extension implements FilenameFilter{
	
	String extension;
	
	public Extension(){
		this.extension=".splt";
	}

	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(extension);
	}
	
	
}
