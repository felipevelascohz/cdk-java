package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class JavaCdkHelloStack extends Stack {

    public JavaCdkHelloStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);
        Bucket.Builder.create(this, id)
            .versioned(true)
            .build();
    }
}