import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class hashgen {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Start timing

        try {
            // Specify the paths of the two files to compare
            File file1 = new File("C:\\Users\\ckche\\Documents\\coding\\Java codes\\java_beforedsa.png");
            File file2 = new File("C:\\Users\\ckche\\Documents\\coding\\Java codes\\HBCD_PE_x64.iso");

            // Generate the hash values for both files
            String hash1 = generateFileHash(file1, "SHA-256");
            String hash2 = generateFileHash(file2, "SHA-256");

            // Display the hash values
            System.out.println("Hash of File 1: " + hash1);
            System.out.println("Hash of File 2: " + hash2);

            // Compare the hash values
            if (hash1.equals(hash2)) {
                System.out.println("The files are identical (hash values are the same).");
            } else {
                System.out.println("The files are different (hash values are different).");
            }

        } catch (IOException | NoSuchAlgorithmException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis(); // End timing

        // Calculate and print the duration
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    // Method to generate a hash value for a file using the specified algorithm
    private static String generateFileHash(File file, String algorithm) throws IOException, NoSuchAlgorithmException {
        // Create a MessageDigest instance for the specified algorithm
        MessageDigest digest = MessageDigest.getInstance(algorithm);

        // Read the file and update the MessageDigest
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] byteArray = new byte[1024];
            int bytesCount;

            while ((bytesCount = fis.read(byteArray)) != -1) {
                digest.update(byteArray, 0, bytesCount);
            }
        }

        // Convert the byte array to a hex string
        return byteArrayToHex(digest.digest());
    }

    // Helper method to convert byte array to hex string
    private static String byteArrayToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
