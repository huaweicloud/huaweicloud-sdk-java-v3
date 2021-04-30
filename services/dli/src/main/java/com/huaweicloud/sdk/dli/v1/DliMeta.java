package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dli.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DliMeta {

    public static final HttpRequestDef<CreateQueueRequest, CreateQueueResponse> createQueue = genForcreateQueue();

    private static HttpRequestDef<CreateQueueRequest, CreateQueueResponse> genForcreateQueue() {
        // basic
        HttpRequestDef.Builder<CreateQueueRequest, CreateQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueueRequest.class, CreateQueueResponse.class)
                .withName("CreateQueue")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateQueueReq.class,
            f -> f.withMarshaller(CreateQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genFordeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genFordeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withName("DeleteQueue")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQueuesRequest, ListQueuesResponse> listQueues = genForlistQueues();

    private static HttpRequestDef<ListQueuesRequest, ListQueuesResponse> genForlistQueues() {
        // basic
        HttpRequestDef.Builder<ListQueuesRequest, ListQueuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuesRequest.class, ListQueuesResponse.class)
                .withName("ListQueues")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListQueuesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
            })
        );
        builder.withRequestField("with-charge-info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListQueuesRequest::getWithChargeInfo, (req, v) -> {
                req.setWithChargeInfo(v);
            })
        );
        builder.withRequestField("queue_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQueuesRequest::getQueueType, (req, v) -> {
                req.setQueueType(v);
            })
        );
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQueuesRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );

        // response
        


        return builder.build();
    }

}
