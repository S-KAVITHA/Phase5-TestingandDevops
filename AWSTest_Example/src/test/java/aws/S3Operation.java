package aws;

import java.io.File;
import java.util.List;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class S3Operation {

	public static void main(String[] args) throws InterruptedException {

		AWSCredentials credentials = new BasicAWSCredentials("AKIAZ5XW5O3DWGCAN5O6",
				"oczJB7d/LJ96lhD1jlVwUfU7UZEU+Y9M/SEScHgq");

		AmazonS3 s3client = AmazonS3ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_1).build();
//================ List all the buckets ==============
        
        List<Bucket> buckets = s3client.listBuckets();
        
        for(Bucket bucket : buckets) {
            System.out.println(bucket.getName());
        }
        
		/*s3client.createBucket("nik107-bucket");
		System.out.println("Bucket created");*/
        
// =============== Delete Bucket ===============
        
     //   s3client.deleteBucket("nik107-bucket");
       // System.out.println("bucket deleted");
        
        s3client.putObject("nik105-bucket",
        		            "chromedriver.exe" , 
        		            new File("C:\\Grid\\chromedriver.exe"));
	}
}
