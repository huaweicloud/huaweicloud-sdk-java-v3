package com.huaweicloud.sdk.pangulargemodels.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.pangulargemodels.v1.model.ChatCompletionReq;
import com.huaweicloud.sdk.pangulargemodels.v1.model.ExecuteChatCompletionRequest;
import com.huaweicloud.sdk.pangulargemodels.v1.model.ExecuteChatCompletionResponse;
import com.huaweicloud.sdk.pangulargemodels.v1.model.ExecuteTextCompletionRequest;
import com.huaweicloud.sdk.pangulargemodels.v1.model.ExecuteTextCompletionResponse;
import com.huaweicloud.sdk.pangulargemodels.v1.model.TextCompletionReq;

@SuppressWarnings("unchecked")
public class PanguLargeModelsMeta {

    public static final HttpRequestDef<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse> executeChatCompletion =
        genForExecuteChatCompletion();

    private static HttpRequestDef<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse> genForExecuteChatCompletion() {
        // basic
        HttpRequestDef.Builder<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteChatCompletionRequest.class, ExecuteChatCompletionResponse.class)
            .withName("ExecuteChatCompletion")
            .withUri("/v1/{project_id}/deployments/{deployment_id}/chat/completions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteChatCompletionRequest::getDeploymentId,
                ExecuteChatCompletionRequest::setDeploymentId));
        builder.<ChatCompletionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChatCompletionReq.class),
            f -> f.withMarshaller(ExecuteChatCompletionRequest::getBody, ExecuteChatCompletionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> executeTextCompletion =
        genForExecuteTextCompletion();

    private static HttpRequestDef<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> genForExecuteTextCompletion() {
        // basic
        HttpRequestDef.Builder<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteTextCompletionRequest.class, ExecuteTextCompletionResponse.class)
            .withName("ExecuteTextCompletion")
            .withUri("/v1/{project_id}/deployments/{deployment_id}/text/completions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTextCompletionRequest::getDeploymentId,
                ExecuteTextCompletionRequest::setDeploymentId));
        builder.<TextCompletionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextCompletionReq.class),
            f -> f.withMarshaller(ExecuteTextCompletionRequest::getBody, ExecuteTextCompletionRequest::setBody));

        // response

        return builder.build();
    }

}
