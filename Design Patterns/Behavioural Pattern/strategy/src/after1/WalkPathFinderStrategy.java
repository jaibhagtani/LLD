package after1;

import java.nio.file.Path;

public class WalkPathFinderStrategy implements PathFinderStrategy {

    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding for Walk");
    }
}
