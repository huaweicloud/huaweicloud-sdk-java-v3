package com.huaweicloud.sdk.ces.v3;

import com.huaweicloud.sdk.ces.v3.model.BatchCreateAgentInvocationsRequest;
import com.huaweicloud.sdk.ces.v3.model.BatchCreateAgentInvocationsResponse;
import com.huaweicloud.sdk.ces.v3.model.BatchCreateInvocationRequestBody;
import com.huaweicloud.sdk.ces.v3.model.ListAgentInvocationsRequest;
import com.huaweicloud.sdk.ces.v3.model.ListAgentInvocationsResponse;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusRequest;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusRequestBody;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<ListAgentStatusRequest, ListAgentStatusResponse> listAgentStatus =
        genForlistAgentStatus();

    private static HttpRequestDef<ListAgentStatusRequest, ListAgentStatusResponse> genForlistAgentStatus() {
        // basic
        HttpRequestDef.Builder<ListAgentStatusRequest, ListAgentStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAgentStatusRequest.class, ListAgentStatusResponse.class)
                .withName("ListAgentStatus")
                .withUri("/v3/{project_id}/agent-status/batch-query")
                .withContentType("application/json");

        // requests
        builder.<ListAgentStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentStatusRequestBody.class),
            f -> f.withMarshaller(ListAgentStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse> batchCreateAgentInvocations =
        genForbatchCreateAgentInvocations();

    private static HttpRequestDef<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse> genForbatchCreateAgentInvocations() {
        // basic
        HttpRequestDef.Builder<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateAgentInvocationsRequest.class,
                    BatchCreateAgentInvocationsResponse.class)
                .withName("BatchCreateAgentInvocations")
                .withUri("/v3/{project_id}/agent-invocations/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateInvocationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateInvocationRequestBody.class),
            f -> f.withMarshaller(BatchCreateAgentInvocationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgentInvocationsRequest, ListAgentInvocationsResponse> listAgentInvocations =
        genForlistAgentInvocations();

    private static HttpRequestDef<ListAgentInvocationsRequest, ListAgentInvocationsResponse> genForlistAgentInvocations() {
        // basic
        HttpRequestDef.Builder<ListAgentInvocationsRequest, ListAgentInvocationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAgentInvocationsRequest.class, ListAgentInvocationsResponse.class)
            .withName("ListAgentInvocations")
            .withUri("/v3/{project_id}/agent-invocations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListAgentInvocationsRequest.InstanceTypeEnum>withRequestField("instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInvocationsRequest.InstanceTypeEnum.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getInstanceType, (req, v) -> {
                req.setInstanceType(v);
            }));
        builder.<String>withRequestField("invocation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getInvocationId, (req, v) -> {
                req.setInvocationId(v);
            }));
        builder.<ListAgentInvocationsRequest.InvocationTypeEnum>withRequestField("invocation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInvocationsRequest.InvocationTypeEnum.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getInvocationType, (req, v) -> {
                req.setInvocationType(v);
            }));
        builder.<ListAgentInvocationsRequest.InvocationTargetEnum>withRequestField("invocation_target",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInvocationsRequest.InvocationTargetEnum.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getInvocationTarget, (req, v) -> {
                req.setInvocationTarget(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentInvocationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
