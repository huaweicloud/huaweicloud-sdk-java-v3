package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dbss.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DbssMeta {

    public static final HttpRequestDef<SwitchAgentRequest, SwitchAgentResponse> switchAgent = genForswitchAgent();

    private static HttpRequestDef<SwitchAgentRequest, SwitchAgentResponse> genForswitchAgent() {
        // basic
        HttpRequestDef.Builder<SwitchAgentRequest, SwitchAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAgentRequest.class, SwitchAgentResponse.class)
                .withName("SwitchAgent")
                .withUri("/dbss/v1/{project_id}/{instance_id}/audit/agent/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAgentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<AgentSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentSwitchRequest.class),
            f -> f.withMarshaller(SwitchAgentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRule = genForswitchRiskRule();

    private static HttpRequestDef<SwitchRiskRuleRequest, SwitchRiskRuleResponse> genForswitchRiskRule() {
        // basic
        HttpRequestDef.Builder<SwitchRiskRuleRequest, SwitchRiskRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchRiskRuleRequest.class, SwitchRiskRuleResponse.class)
                .withName("SwitchRiskRule")
                .withUri("/dbss/v1/{project_id}/{instance_id}/audit/rule/risk/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRiskRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<BatchSwitchesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSwitchesRequest.class),
            f -> f.withMarshaller(SwitchRiskRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
