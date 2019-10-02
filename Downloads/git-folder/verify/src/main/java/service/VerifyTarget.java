package service;

import java.io.File;

public class VerifyTarget {

    public boolean verifyTarget(String srcDir, String targetDir) {

        int numberOfSrcFiles = getNumberOfFiles(srcDir, "java");
        int numberOfTargetFiles = getNumberOfFiles(targetDir, "java");

        return numberOfSrcFiles == numberOfTargetFiles;

    }

    protected int getNumberOfFiles(String dir, String endsWith) {
        File targetFile = new File(dir);
        String[] fileList = targetFile.list();
        int numberOfTargetFiles = 0;
        for (String fileString : fileList) {
            File directoryCheck = new File(dir + "\\" + fileString);
            if (directoryCheck.isFile()) {
                String fileName = directoryCheck.getName();
                if (fileName.endsWith(endsWith)) {
                    numberOfTargetFiles++;
                }
            }
        }

        return numberOfTargetFiles;
    }
}
