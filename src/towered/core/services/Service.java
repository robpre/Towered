/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 24 Feb 2013
 * @project Towered
 */
package towered.core.services;

/**
 * The Class Service.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 24 Feb 2013
 * @project Towered
 */
public abstract class Service {
    
    /** The Constant JAR_FILE. */
    private final String JAR_FILE = Service.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    
    /**
     * Get the jar file path
     * @return the path
     */
    public String getJarFile() {
        return this.JAR_FILE;
    }
    
    /**
     * Gets the jar dir.
     *
     * @return the jar dir
     */
    public String getJarDir() {
        int i = getJarFile().lastIndexOf('/');
        String dir = JAR_FILE.substring(0, i);
        return dir;
    }
}