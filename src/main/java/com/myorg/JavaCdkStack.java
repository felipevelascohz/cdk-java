package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class JavaCdkStack extends Stack {
    public JavaCdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);
        Bucket.Builder.create(this, "MyFirstBucket")
            .versioned(true)
            .build();
        Bucket.Builder.create(this, "MyThirdBucket")
            .versioned(true)
            .build();        
    }
}
