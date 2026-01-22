package test_jrt_filesystem;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestJRTFileSystem {
  
  public static void main(String[] args){
    FileSystem fs = FileSystems.getFileSystem(URI.create("jrt:/"));
    Path p = fs.getPath("/modules/java.base/java/lang/String.class");
    
    System.out.println(Files.exists(p));
  }
}
