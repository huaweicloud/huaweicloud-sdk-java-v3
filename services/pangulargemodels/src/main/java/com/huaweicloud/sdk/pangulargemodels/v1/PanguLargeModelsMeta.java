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
        genForexecuteChatCompletion();

    private static HttpRequestDef<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse> genForexecuteChatCompletion() {
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
            f -> f.withMarshaller(ExecuteChatCompletionRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<ChatCompletionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChatCompletionReq.class),
            f -> f.withMarshaller(ExecuteChatCompletionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> executeTextCompletion =
        genForexecuteTextCompletion();

    private static HttpRequestDef<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> genForexecuteTextCompletion() {
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
            f -> f.withMarshaller(ExecuteTextCompletionRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<TextCompletionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextCompletionReq.class),
            f -> f.withMarshaller(ExecuteTextCompletionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
