package com.huaweicloud.sdk.versatile.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.versatile.v1.model.AgentRunReq;
import com.huaweicloud.sdk.versatile.v1.model.KnowledgeBaseRetrievalReq;
import com.huaweicloud.sdk.versatile.v1.model.RunAgentRequest;
import com.huaweicloud.sdk.versatile.v1.model.RunAgentResponse;
import com.huaweicloud.sdk.versatile.v1.model.RunWorkflowRequest;
import com.huaweicloud.sdk.versatile.v1.model.RunWorkflowResponse;
import com.huaweicloud.sdk.versatile.v1.model.SearchKnowledgeBaseRequest;
import com.huaweicloud.sdk.versatile.v1.model.SearchKnowledgeBaseResponse;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileRequest;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileRequestBody;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileResponse;
import com.huaweicloud.sdk.versatile.v1.model.WorkflowRunReq;

@SuppressWarnings("unchecked")
public class VersatileMeta {

    public static final HttpRequestDef<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse> searchKnowledgeBase =
        genForSearchKnowledgeBase();

    private static HttpRequestDef<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse> genForSearchKnowledgeBase() {
        // basic
        HttpRequestDef.Builder<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchKnowledgeBaseRequest.class, SearchKnowledgeBaseResponse.class)
                .withName("SearchKnowledgeBase")
                .withUri("/v2/{project_id}/knowledge-bases/retrieve")
                .withContentType("application/json");

        // requests
        builder.<KnowledgeBaseRetrievalReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KnowledgeBaseRetrievalReq.class),
            f -> f.withMarshaller(SearchKnowledgeBaseRequest::getBody, SearchKnowledgeBaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAgentRequest, RunAgentResponse> runAgent = genForRunAgent();

    private static HttpRequestDef<RunAgentRequest, RunAgentResponse> genForRunAgent() {
        // basic
        HttpRequestDef.Builder<RunAgentRequest, RunAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunAgentRequest.class, RunAgentResponse.class)
                .withName("RunAgent")
                .withUri("/v1/{project_id}/agents/{agent_id}/conversations/{conversation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAgentRequest::getAgentId, RunAgentRequest::setAgentId));
        builder.<String>withRequestField("conversation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAgentRequest::getConversationId, RunAgentRequest::setConversationId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAgentRequest::getWorkspaceId, RunAgentRequest::setWorkspaceId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAgentRequest::getVersion, RunAgentRequest::setVersion));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAgentRequest::getType, RunAgentRequest::setType));
        builder.<Boolean>withRequestField("stream",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(RunAgentRequest::getStream, RunAgentRequest::setStream));
        builder.<AgentRunReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentRunReq.class),
            f -> f.withMarshaller(RunAgentRequest::getBody, RunAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunWorkflowRequest, RunWorkflowResponse> runWorkflow = genForRunWorkflow();

    private static HttpRequestDef<RunWorkflowRequest, RunWorkflowResponse> genForRunWorkflow() {
        // basic
        HttpRequestDef.Builder<RunWorkflowRequest, RunWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunWorkflowRequest.class, RunWorkflowResponse.class)
                .withName("RunWorkflow")
                .withUri("/v1/{project_id}/workflows/{workflow_id}/conversations/{conversation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunWorkflowRequest::getWorkflowId, RunWorkflowRequest::setWorkflowId));
        builder.<String>withRequestField("conversation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunWorkflowRequest::getConversationId, RunWorkflowRequest::setConversationId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunWorkflowRequest::getWorkspaceId, RunWorkflowRequest::setWorkspaceId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunWorkflowRequest::getVersion, RunWorkflowRequest::setVersion));
        builder.<Boolean>withRequestField("stream",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(RunWorkflowRequest::getStream, RunWorkflowRequest::setStream));
        builder.<WorkflowRunReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowRunReq.class),
            f -> f.withMarshaller(RunWorkflowRequest::getBody, RunWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAgentFileRequest, UploadAgentFileResponse> uploadAgentFile =
        genForUploadAgentFile();

    private static HttpRequestDef<UploadAgentFileRequest, UploadAgentFileResponse> genForUploadAgentFile() {
        // basic
        HttpRequestDef.Builder<UploadAgentFileRequest, UploadAgentFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAgentFileRequest.class, UploadAgentFileResponse.class)
                .withName("UploadAgentFile")
                .withUri("/v1/{project_id}/agent-runtime/upload-file")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAgentFileRequest::getWorkspaceId, UploadAgentFileRequest::setWorkspaceId));
        builder.<Integer>withRequestField("expires",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadAgentFileRequest::getExpires, UploadAgentFileRequest::setExpires));
        builder.<Boolean>withRequestField("is_image",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UploadAgentFileRequest::getIsImage, UploadAgentFileRequest::setIsImage));
        builder.<UploadAgentFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAgentFileRequestBody.class),
            f -> f.withMarshaller(UploadAgentFileRequest::getBody, UploadAgentFileRequest::setBody));

        // response

        return builder.build();
    }

}
