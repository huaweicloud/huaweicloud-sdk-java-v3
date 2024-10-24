package com.huaweicloud.sdk.aom.v4;

import com.huaweicloud.sdk.aom.v4.model.AgentBatchImportParamNew;
import com.huaweicloud.sdk.aom.v4.model.AgentInfoParam;
import com.huaweicloud.sdk.aom.v4.model.AgentUpgradeParam;
import com.huaweicloud.sdk.aom.v4.model.BatchImportAgentRequest;
import com.huaweicloud.sdk.aom.v4.model.BatchImportAgentResponse;
import com.huaweicloud.sdk.aom.v4.model.BatchUpdateAgentRequest;
import com.huaweicloud.sdk.aom.v4.model.BatchUpdateAgentResponse;
import com.huaweicloud.sdk.aom.v4.model.ShowAgentInfosRequest;
import com.huaweicloud.sdk.aom.v4.model.ShowAgentInfosResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<BatchImportAgentRequest, BatchImportAgentResponse> batchImportAgent =
        genForBatchImportAgent();

    private static HttpRequestDef<BatchImportAgentRequest, BatchImportAgentResponse> genForBatchImportAgent() {
        // basic
        HttpRequestDef.Builder<BatchImportAgentRequest, BatchImportAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchImportAgentRequest.class, BatchImportAgentResponse.class)
                .withName("BatchImportAgent")
                .withUri("/v1/{project_id}/uniagent-console/mainview/batch-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchImportAgentRequest::getRegion, BatchImportAgentRequest::setRegion));
        builder.<AgentBatchImportParamNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentBatchImportParamNew.class),
            f -> f.withMarshaller(BatchImportAgentRequest::getBody, BatchImportAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAgentRequest, BatchUpdateAgentResponse> batchUpdateAgent =
        genForBatchUpdateAgent();

    private static HttpRequestDef<BatchUpdateAgentRequest, BatchUpdateAgentResponse> genForBatchUpdateAgent() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAgentRequest, BatchUpdateAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateAgentRequest.class, BatchUpdateAgentResponse.class)
                .withName("BatchUpdateAgent")
                .withUri("/v1/{project_id}/uniagent-console/upgrade/batch-upgrade")
                .withContentType("application/json");

        // requests
        builder.<AgentUpgradeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentUpgradeParam.class),
            f -> f.withMarshaller(BatchUpdateAgentRequest::getBody, BatchUpdateAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentInfosRequest, ShowAgentInfosResponse> showAgentInfos =
        genForShowAgentInfos();

    private static HttpRequestDef<ShowAgentInfosRequest, ShowAgentInfosResponse> genForShowAgentInfos() {
        // basic
        HttpRequestDef.Builder<ShowAgentInfosRequest, ShowAgentInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowAgentInfosRequest.class, ShowAgentInfosResponse.class)
                .withName("ShowAgentInfos")
                .withUri("/v1/uniagent-console/agent-list/all")
                .withContentType("application/json");

        // requests
        builder.<AgentInfoParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentInfoParam.class),
            f -> f.withMarshaller(ShowAgentInfosRequest::getBody, ShowAgentInfosRequest::setBody));

        // response

        return builder.build();
    }

}
