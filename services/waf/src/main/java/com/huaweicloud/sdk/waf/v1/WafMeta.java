package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.waf.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class WafMeta {

    public static final HttpRequestDef<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse> confirmCloudWafSubscriptionInfo = genForconfirmCloudWafSubscriptionInfo();

    private static HttpRequestDef<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse> genForconfirmCloudWafSubscriptionInfo() {
        // basic
        HttpRequestDef.Builder<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConfirmCloudWafSubscriptionInfoRequest.class, ConfirmCloudWafSubscriptionInfoResponse.class)
                .withName("ConfirmCloudWafSubscriptionInfo")
                .withUri("/v1/{project_id}/waf/subscription")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ConfirmUserBundleRequest, ConfirmUserBundleResponse> confirmUserBundle = genForconfirmUserBundle();

    private static HttpRequestDef<ConfirmUserBundleRequest, ConfirmUserBundleResponse> genForconfirmUserBundle() {
        // basic
        HttpRequestDef.Builder<ConfirmUserBundleRequest, ConfirmUserBundleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConfirmUserBundleRequest.class, ConfirmUserBundleResponse.class)
                .withName("ConfirmUserBundle")
                .withUri("/v1/{project_id}/waf/bundle")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse> createAnticrawlerRules = genForcreateAnticrawlerRules();

    private static HttpRequestDef<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse> genForcreateAnticrawlerRules() {
        // basic
        HttpRequestDef.Builder<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAnticrawlerRulesRequest.class, CreateAnticrawlerRulesResponse.class)
                .withName("CreateAnticrawlerRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAnticrawlerRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PolicyAntiCrawlerPostInfo.class,
            f -> f.withMarshaller(CreateAnticrawlerRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse> createAntileakageRules = genForcreateAntileakageRules();

    private static HttpRequestDef<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse> genForcreateAntileakageRules() {
        // basic
        HttpRequestDef.Builder<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAntileakageRulesRequest.class, CreateAntileakageRulesResponse.class)
                .withName("CreateAntileakageRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAntileakageRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAntiLeakageRequestBody.class,
            f -> f.withMarshaller(CreateAntileakageRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateCcRuleRequest, CreateCcRuleResponse> createCcRule = genForcreateCcRule();

    private static HttpRequestDef<CreateCcRuleRequest, CreateCcRuleResponse> genForcreateCcRule() {
        // basic
        HttpRequestDef.Builder<CreateCcRuleRequest, CreateCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCcRuleRequest.class, CreateCcRuleResponse.class)
                .withName("CreateCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            CcrulePostInfo.class,
            f -> f.withMarshaller(CreateCcRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate = genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCertificateRequestBody.class,
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomRulesRequest, CreateCustomRulesResponse> createCustomRules = genForcreateCustomRules();

    private static HttpRequestDef<CreateCustomRulesRequest, CreateCustomRulesResponse> genForcreateCustomRules() {
        // basic
        HttpRequestDef.Builder<CreateCustomRulesRequest, CreateCustomRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomRulesRequest.class, CreateCustomRulesResponse.class)
                .withName("CreateCustomRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCustomRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CustomPostBody.class,
            f -> f.withMarshaller(CreateCustomRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateGeoipRulesRequest, CreateGeoipRulesResponse> createGeoipRules = genForcreateGeoipRules();

    private static HttpRequestDef<CreateGeoipRulesRequest, CreateGeoipRulesResponse> genForcreateGeoipRules() {
        // basic
        HttpRequestDef.Builder<CreateGeoipRulesRequest, CreateGeoipRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGeoipRulesRequest.class, CreateGeoipRulesResponse.class)
                .withName("CreateGeoipRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateGeoipRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            GeoIpBody.class,
            f -> f.withMarshaller(CreateGeoipRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateInstaneRequest, CreateInstaneResponse> createInstane = genForcreateInstane();

    private static HttpRequestDef<CreateInstaneRequest, CreateInstaneResponse> genForcreateInstane() {
        // basic
        HttpRequestDef.Builder<CreateInstaneRequest, CreateInstaneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstaneRequest.class, CreateInstaneResponse.class)
                .withName("CreateInstane")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceBody.class,
            f -> f.withMarshaller(CreateInstaneRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForcreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForcreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePolicyBody.class,
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHost = genForcreatePremiumHost();

    private static HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> genForcreatePremiumHost() {
        // basic
        HttpRequestDef.Builder<CreatePremiumHostRequest, CreatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePremiumHostRequest.class, CreatePremiumHostResponse.class)
                .withName("CreatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            CreatePremiumHostRequestBody.class,
            f -> f.withMarshaller(CreatePremiumHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRule = genFordeleteAnticrawlerRule();

    private static HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> genFordeleteAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAnticrawlerRuleRequest.class, DeleteAnticrawlerRuleResponse.class)
                .withName("DeleteAnticrawlerRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRule = genFordeleteAntileakageRule();

    private static HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> genFordeleteAntileakageRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAntileakageRuleRequest.class, DeleteAntileakageRuleResponse.class)
                .withName("DeleteAntileakageRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRule = genFordeleteCcRule();

    private static HttpRequestDef<DeleteCcRuleRequest, DeleteCcRuleResponse> genFordeleteCcRule() {
        // basic
        HttpRequestDef.Builder<DeleteCcRuleRequest, DeleteCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCcRuleRequest.class, DeleteCcRuleResponse.class)
                .withName("DeleteCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCcRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate = genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRule = genFordeleteCustomRule();

    private static HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> genFordeleteCustomRule() {
        // basic
        HttpRequestDef.Builder<DeleteCustomRuleRequest, DeleteCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomRuleRequest.class, DeleteCustomRuleResponse.class)
                .withName("DeleteCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCustomRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRule = genFordeleteGeoipRule();

    private static HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> genFordeleteGeoipRule() {
        // basic
        HttpRequestDef.Builder<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGeoipRuleRequest.class, DeleteGeoipRuleResponse.class)
                .withName("DeleteGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstaneRequest, DeleteInstaneResponse> deleteInstane = genFordeleteInstane();

    private static HttpRequestDef<DeleteInstaneRequest, DeleteInstaneResponse> genFordeleteInstane() {
        // basic
        HttpRequestDef.Builder<DeleteInstaneRequest, DeleteInstaneResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstaneRequest.class, DeleteInstaneResponse.class)
                .withName("DeleteInstane")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteInstaneRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genFordeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genFordeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHost = genFordeletePremiumHost();

    private static HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> genFordeletePremiumHost() {
        // basic
        HttpRequestDef.Builder<DeletePremiumHostRequest, DeletePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePremiumHostRequest.class, DeletePremiumHostResponse.class)
                .withName("DeletePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );
        builder.withRequestField("keepPolicy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(DeletePremiumHostRequest::getKeepPolicy, (req, v) -> {
                req.setKeepPolicy(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRules = genForlistAnticrawlerRules();

    private static HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> genForlistAnticrawlerRules() {
        // basic
        HttpRequestDef.Builder<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAnticrawlerRulesRequest.class, ListAnticrawlerRulesResponse.class)
                .withName("ListAnticrawlerRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRules = genForlistAntileakageRules();

    private static HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> genForlistAntileakageRules() {
        // basic
        HttpRequestDef.Builder<ListAntileakageRulesRequest, ListAntileakageRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntileakageRulesRequest.class, ListAntileakageRulesResponse.class)
                .withName("ListAntileakageRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAntileakageRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAntileakageRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAntileakageRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAttackActionRequest, ListAttackActionResponse> listAttackAction = genForlistAttackAction();

    private static HttpRequestDef<ListAttackActionRequest, ListAttackActionResponse> genForlistAttackAction() {
        // basic
        HttpRequestDef.Builder<ListAttackActionRequest, ListAttackActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttackActionRequest.class, ListAttackActionResponse.class)
                .withName("ListAttackAction")
                .withUri("/v1/{project_id}/waf/overviews/attack/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListAttackActionRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListAttackActionRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAttackActionRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAttackActionRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAttackDistributionRequest, ListAttackDistributionResponse> listAttackDistribution = genForlistAttackDistribution();

    private static HttpRequestDef<ListAttackDistributionRequest, ListAttackDistributionResponse> genForlistAttackDistribution() {
        // basic
        HttpRequestDef.Builder<ListAttackDistributionRequest, ListAttackDistributionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttackDistributionRequest.class, ListAttackDistributionResponse.class)
                .withName("ListAttackDistribution")
                .withUri("/v1/{project_id}/waf/overviews/attack/distribution")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListAttackDistributionRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListAttackDistributionRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAttackDistributionRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAttackDistributionRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimeline = genForlistBandwidthTimeline();

    private static HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> genForlistBandwidthTimeline() {
        // basic
        HttpRequestDef.Builder<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthTimelineRequest.class, ListBandwidthTimelineResponse.class)
                .withName("ListBandwidthTimeline")
                .withUri("/v1/{project_id}/waf/overviews/bandwidth/timeline")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );
        builder.withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListBandwidthTimelineResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(StatisticsTimelineItem.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListCcRulesRequest, ListCcRulesResponse> listCcRules = genForlistCcRules();

    private static HttpRequestDef<ListCcRulesRequest, ListCcRulesResponse> genForlistCcRules() {
        // basic
        HttpRequestDef.Builder<ListCcRulesRequest, ListCcRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCcRulesRequest.class, ListCcRulesResponse.class)
                .withName("ListCcRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCcRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCcRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCcRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates = genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCertificatesRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListCertificatesRequest::getHost, (req, v) -> {
                req.setHost(v);
            })
        );
        builder.withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListCertificatesRequest.ExpStatusEnum.class,
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, (req, v) -> {
                req.setExpStatus(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRules = genForlistCustomRules();

    private static HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> genForlistCustomRules() {
        // basic
        HttpRequestDef.Builder<ListCustomRulesRequest, ListCustomRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomRulesRequest.class, ListCustomRulesResponse.class)
                .withName("ListCustomRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCustomRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEventByTimelineRequest, ListEventByTimelineResponse> listEventByTimeline = genForlistEventByTimeline();

    private static HttpRequestDef<ListEventByTimelineRequest, ListEventByTimelineResponse> genForlistEventByTimeline() {
        // basic
        HttpRequestDef.Builder<ListEventByTimelineRequest, ListEventByTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventByTimelineRequest.class, ListEventByTimelineResponse.class)
                .withName("ListEventByTimeline")
                .withUri("/v1/{project_id}/waf/event/timeline")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEventByTimelineRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListEventByTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v1/{project_id}/waf/event")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEventsRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListEventsRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventsRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventsRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGeoipRulesRequest, ListGeoipRulesResponse> listGeoipRules = genForlistGeoipRules();

    private static HttpRequestDef<ListGeoipRulesRequest, ListGeoipRulesResponse> genForlistGeoipRules() {
        // basic
        HttpRequestDef.Builder<ListGeoipRulesRequest, ListGeoipRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGeoipRulesRequest.class, ListGeoipRulesResponse.class)
                .withName("ListGeoipRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListGeoipRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListGeoipRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListGeoipRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForlistInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForlistInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v1/{project_id}/premium-waf/instance")
                .withContentType("application/json");

        // requests
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstanceRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstanceRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            })
        );
        builder.withRequestField("instancename",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstanceRequest::getInstancename, (req, v) -> {
                req.setInstancename(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstanesRequest, ListInstanesResponse> listInstanes = genForlistInstanes();

    private static HttpRequestDef<ListInstanesRequest, ListInstanesResponse> genForlistInstanes() {
        // basic
        HttpRequestDef.Builder<ListInstanesRequest, ListInstanesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanesRequest.class, ListInstanesResponse.class)
                .withName("ListInstanes")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstanesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstanesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForlistPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForlistPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPolicyRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPolicyRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHost = genForlistPremiumHost();

    private static HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> genForlistPremiumHost() {
        // basic
        HttpRequestDef.Builder<ListPremiumHostRequest, ListPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPremiumHostRequest.class, ListPremiumHostResponse.class)
                .withName("ListPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPremiumHostRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPremiumHostRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            })
        );
        builder.withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPremiumHostRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            })
        );
        builder.withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPremiumHostRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            })
        );
        builder.withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPremiumHostRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQpsRequest, ListQpsResponse> listQps = genForlistQps();

    private static HttpRequestDef<ListQpsRequest, ListQpsResponse> genForlistQps() {
        // basic
        HttpRequestDef.Builder<ListQpsRequest, ListQpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQpsRequest.class, ListQpsResponse.class)
                .withName("ListQps")
                .withUri("/v1/{project_id}/waf/event/request/peak")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListQpsRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListQpsRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimeline = genForlistQpsTimeline();

    private static HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> genForlistQpsTimeline() {
        // basic
        HttpRequestDef.Builder<ListQpsTimelineRequest, ListQpsTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQpsTimelineRequest.class, ListQpsTimelineResponse.class)
                .withName("ListQpsTimeline")
                .withUri("/v1/{project_id}/waf/overviews/qps/timeline")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListQpsTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListQpsTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQpsTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQpsTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );
        builder.withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQpsTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListQpsTimelineResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(StatisticsTimelineItem.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimeline = genForlistRequestTimeline();

    private static HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> genForlistRequestTimeline() {
        // basic
        HttpRequestDef.Builder<ListRequestTimelineRequest, ListRequestTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestTimelineRequest.class, ListRequestTimelineResponse.class)
                .withName("ListRequestTimeline")
                .withUri("/v1/{project_id}/waf/overviews/request/timeline")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListRequestTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListRequestTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );
        builder.withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListRequestTimelineResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(StatisticsTimelineItem.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> listResponseCodeTimeline = genForlistResponseCodeTimeline();

    private static HttpRequestDef<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> genForlistResponseCodeTimeline() {
        // basic
        HttpRequestDef.Builder<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResponseCodeTimelineRequest.class, ListResponseCodeTimelineResponse.class)
                .withName("ListResponseCodeTimeline")
                .withUri("/v1/{project_id}/waf/overviews/response-code/timeline")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );
        builder.withRequestField("response_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListResponseCodeTimelineRequest.ResponseSourceEnum.class,
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getResponseSource, (req, v) -> {
                req.setResponseSource(v);
            })
        );
        builder.withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListResponseCodeTimelineResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(StatisticsTimelineItem.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListSourceDomainTop5Request, ListSourceDomainTop5Response> listSourceDomainTop5 = genForlistSourceDomainTop5();

    private static HttpRequestDef<ListSourceDomainTop5Request, ListSourceDomainTop5Response> genForlistSourceDomainTop5() {
        // basic
        HttpRequestDef.Builder<ListSourceDomainTop5Request, ListSourceDomainTop5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourceDomainTop5Request.class, ListSourceDomainTop5Response.class)
                .withName("ListSourceDomainTop5")
                .withUri("/v1/{project_id}/waf/event/attack/domain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSourceDomainTop5Request::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSourceDomainTop5Request::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSourceIpNumRequest, ListSourceIpNumResponse> listSourceIpNum = genForlistSourceIpNum();

    private static HttpRequestDef<ListSourceIpNumRequest, ListSourceIpNumResponse> genForlistSourceIpNum() {
        // basic
        HttpRequestDef.Builder<ListSourceIpNumRequest, ListSourceIpNumResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourceIpNumRequest.class, ListSourceIpNumResponse.class)
                .withName("ListSourceIpNum")
                .withUri("/v1/{project_id}/waf/event/attack/source/num")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSourceIpNumRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSourceIpNumRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSourceIpTop5Request, ListSourceIpTop5Response> listSourceIpTop5 = genForlistSourceIpTop5();

    private static HttpRequestDef<ListSourceIpTop5Request, ListSourceIpTop5Response> genForlistSourceIpTop5() {
        // basic
        HttpRequestDef.Builder<ListSourceIpTop5Request, ListSourceIpTop5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourceIpTop5Request.class, ListSourceIpTop5Response.class)
                .withName("ListSourceIpTop5")
                .withUri("/v1/{project_id}/waf/event/attack/source")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSourceIpTop5Request::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSourceIpTop5Request::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSourceUrlTop5Request, ListSourceUrlTop5Response> listSourceUrlTop5 = genForlistSourceUrlTop5();

    private static HttpRequestDef<ListSourceUrlTop5Request, ListSourceUrlTop5Response> genForlistSourceUrlTop5() {
        // basic
        HttpRequestDef.Builder<ListSourceUrlTop5Request, ListSourceUrlTop5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourceUrlTop5Request.class, ListSourceUrlTop5Response.class)
                .withName("ListSourceUrlTop5")
                .withUri("/v1/{project_id}/waf/event/domain/url")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSourceUrlTop5Request::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSourceUrlTop5Request::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics = genForlistStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForlistStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v1/{project_id}/waf/overviews/statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListStatisticsRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListStatisticsRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListStatisticsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(CountItem.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListThreatsRequest, ListThreatsResponse> listThreats = genForlistThreats();

    private static HttpRequestDef<ListThreatsRequest, ListThreatsResponse> genForlistThreats() {
        // basic
        HttpRequestDef.Builder<ListThreatsRequest, ListThreatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListThreatsRequest.class, ListThreatsResponse.class)
                .withName("ListThreats")
                .withUri("/v1/{project_id}/waf/event/attack/type")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListThreatsRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListThreatsRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormal = genForlistTopAbnormal();

    private static HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> genForlistTopAbnormal() {
        // basic
        HttpRequestDef.Builder<ListTopAbnormalRequest, ListTopAbnormalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopAbnormalRequest.class, ListTopAbnormalResponse.class)
                .withName("ListTopAbnormal")
                .withUri("/v1/{project_id}/waf/overviews/abnormal")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopAbnormalRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopAbnormalRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopAbnormalRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopAbnormalRequest::getCode, (req, v) -> {
                req.setCode(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopAbnormalRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopAbnormalRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTopDomainRequest, ListTopDomainResponse> listTopDomain = genForlistTopDomain();

    private static HttpRequestDef<ListTopDomainRequest, ListTopDomainResponse> genForlistTopDomain() {
        // basic
        HttpRequestDef.Builder<ListTopDomainRequest, ListTopDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopDomainRequest.class, ListTopDomainResponse.class)
                .withName("ListTopDomain")
                .withUri("/v1/{project_id}/waf/overviews/attack/domain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopDomainRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopDomainRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopDomainRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopDomainRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopDomainRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTopIpRequest, ListTopIpResponse> listTopIp = genForlistTopIp();

    private static HttpRequestDef<ListTopIpRequest, ListTopIpResponse> genForlistTopIp() {
        // basic
        HttpRequestDef.Builder<ListTopIpRequest, ListTopIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopIpRequest.class, ListTopIpResponse.class)
                .withName("ListTopIp")
                .withUri("/v1/{project_id}/waf/overviews/attack/ip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopIpRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopIpRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopIpRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopIpRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopIpRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTopRegionRequest, ListTopRegionResponse> listTopRegion = genForlistTopRegion();

    private static HttpRequestDef<ListTopRegionRequest, ListTopRegionResponse> genForlistTopRegion() {
        // basic
        HttpRequestDef.Builder<ListTopRegionRequest, ListTopRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopRegionRequest.class, ListTopRegionResponse.class)
                .withName("ListTopRegion")
                .withUri("/v1/{project_id}/waf/overviews/attack/region")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopRegionRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopRegionRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopRegionRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopRegionRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopRegionRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTopUrlRequest, ListTopUrlResponse> listTopUrl = genForlistTopUrl();

    private static HttpRequestDef<ListTopUrlRequest, ListTopUrlResponse> genForlistTopUrl() {
        // basic
        HttpRequestDef.Builder<ListTopUrlRequest, ListTopUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopUrlRequest.class, ListTopUrlResponse.class)
                .withName("ListTopUrl")
                .withUri("/v1/{project_id}/waf/overviews/attack/url")
                .withContentType("application/json");

        // requests
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopUrlRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ListTopUrlRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopUrlRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopUrlRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTopUrlRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListUrlRequest, ListUrlResponse> listUrl = genForlistUrl();

    private static HttpRequestDef<ListUrlRequest, ListUrlResponse> genForlistUrl() {
        // basic
        HttpRequestDef.Builder<ListUrlRequest, ListUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUrlRequest.class, ListUrlResponse.class)
                .withName("ListUrl")
                .withUri("/v1/{project_id}/waf/event/url")
                .withContentType("application/json");

        // requests
        builder.withRequestField("top",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListUrlRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUrlRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            })
        );
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListUrlRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListUrlRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListUrlRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            })
        );
        builder.withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListUrlRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListValueListRequest, ListValueListResponse> listValueList = genForlistValueList();

    private static HttpRequestDef<ListValueListRequest, ListValueListResponse> genForlistValueList() {
        // basic
        HttpRequestDef.Builder<ListValueListRequest, ListValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListValueListRequest.class, ListValueListResponse.class)
                .withName("ListValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRule = genForshowAnticrawlerRule();

    private static HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> genForshowAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAnticrawlerRuleRequest.class, ShowAnticrawlerRuleResponse.class)
                .withName("ShowAnticrawlerRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRule = genForshowAntileakageRule();

    private static HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> genForshowAntileakageRule() {
        // basic
        HttpRequestDef.Builder<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntileakageRuleRequest.class, ShowAntileakageRuleResponse.class)
                .withName("ShowAntileakageRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCcRuleRequest, ShowCcRuleResponse> showCcRule = genForshowCcRule();

    private static HttpRequestDef<ShowCcRuleRequest, ShowCcRuleResponse> genForshowCcRule() {
        // basic
        HttpRequestDef.Builder<ShowCcRuleRequest, ShowCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCcRuleRequest.class, ShowCcRuleResponse.class)
                .withName("ShowCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCcRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate = genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRule = genForshowCustomRule();

    private static HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> genForshowCustomRule() {
        // basic
        HttpRequestDef.Builder<ShowCustomRuleRequest, ShowCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomRuleRequest.class, ShowCustomRuleResponse.class)
                .withName("ShowCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCustomRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRule = genForshowGeoipRule();

    private static HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> genForshowGeoipRule() {
        // basic
        HttpRequestDef.Builder<ShowGeoipRuleRequest, ShowGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGeoipRuleRequest.class, ShowGeoipRuleResponse.class)
                .withName("ShowGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRouteRequest, ShowInstanceRouteResponse> showInstanceRoute = genForshowInstanceRoute();

    private static HttpRequestDef<ShowInstanceRouteRequest, ShowInstanceRouteResponse> genForshowInstanceRoute() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRouteRequest, ShowInstanceRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRouteRequest.class, ShowInstanceRouteResponse.class)
                .withName("ShowInstanceRoute")
                .withUri("/v1/{project_id}/waf/instance/{instanceid}/route")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instanceid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceRouteRequest::getInstanceid, (req, v) -> {
                req.setInstanceid(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHost = genForshowPremiumHost();

    private static HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> genForshowPremiumHost() {
        // basic
        HttpRequestDef.Builder<ShowPremiumHostRequest, ShowPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPremiumHostRequest.class, ShowPremiumHostResponse.class)
                .withName("ShowPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRule = genForupdateAnticrawlerRule();

    private static HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> genForupdateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAnticrawlerRuleRequest.class, UpdateAnticrawlerRuleResponse.class)
                .withName("UpdateAnticrawlerRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PolicyAntiCrawlerPutInfo.class,
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRule = genForupdateAntileakageRule();

    private static HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> genForupdateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAntileakageRuleRequest.class, UpdateAntileakageRuleResponse.class)
                .withName("UpdateAntileakageRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAntiLeakageRequestBody.class,
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRule = genForupdateCcRule();

    private static HttpRequestDef<UpdateCcRuleRequest, UpdateCcRuleResponse> genForupdateCcRule() {
        // basic
        HttpRequestDef.Builder<UpdateCcRuleRequest, UpdateCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCcRuleRequest.class, UpdateCcRuleResponse.class)
                .withName("UpdateCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCcRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            CreateCcRuleRequestBody.class,
            f -> f.withMarshaller(UpdateCcRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate = genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateCertificateRequestBody.class,
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRule = genForupdateCustomRule();

    private static HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> genForupdateCustomRule() {
        // basic
        HttpRequestDef.Builder<UpdateCustomRuleRequest, UpdateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomRuleRequest.class, UpdateCustomRuleResponse.class)
                .withName("UpdateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCustomRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CustomPostBody.class,
            f -> f.withMarshaller(UpdateCustomRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRule = genForupdateGeoipRule();

    private static HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> genForupdateGeoipRule() {
        // basic
        HttpRequestDef.Builder<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGeoipRuleRequest.class, UpdateGeoipRuleResponse.class)
                .withName("UpdateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            GeoIpBody.class,
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance = genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateInstanceRequestBody.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse> updatePatchPolicy = genForupdatePatchPolicy();

    private static HttpRequestDef<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse> genForupdatePatchPolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePatchPolicyRequest.class, UpdatePatchPolicyResponse.class)
                .withName("UpdatePatchPolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePatchPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePolicyRequestBody.class,
            f -> f.withMarshaller(UpdatePatchPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHost = genForupdatePremiumHost();

    private static HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> genForupdatePremiumHost() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostRequest, UpdatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostRequest.class, UpdatePremiumHostResponse.class)
                .withName("UpdatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdatePremiumHostRequestBody.class,
            f -> f.withMarshaller(UpdatePremiumHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatus = genForupdatePremiumHostAccessStatus();

    private static HttpRequestDef<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> genForupdatePremiumHostAccessStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostAccessStatusRequest.class, UpdatePremiumHostAccessStatusResponse.class)
                .withName("UpdatePremiumHostAccessStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/access_status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePremiumHostAccessStatusRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdatePremiumHostAccessStatusRequestBody.class,
            f -> f.withMarshaller(UpdatePremiumHostAccessStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatus = genForupdatePremiumHostProtectStatus();

    private static HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> genForupdatePremiumHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostProtectStatusRequest.class, UpdatePremiumHostProtectStatusResponse.class)
                .withName("UpdatePremiumHostProtectStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/protect_status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdatePremiumHostProtectStatusRequestBody.class,
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForcreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForcreatePool() {
        // basic
        HttpRequestDef.Builder<CreatePoolRequest, CreatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolRequest.class, CreatePoolResponse.class)
                .withName("CreatePool")
                .withUri("/v1/{project_id}/premium-waf/pool")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            CreatePoolRequestBody.class,
            f -> f.withMarshaller(CreatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genFordeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genFordeletePool() {
        // basic
        HttpRequestDef.Builder<DeletePoolRequest, DeletePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolRequest.class, DeletePoolResponse.class)
                .withName("DeletePool")
                .withUri("/v1/{project_id}/premium-waf/pool/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForlistPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForlistPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withName("ListPools")
                .withUri("/v1/{project_id}/premium-waf/pool")
                .withContentType("application/json");

        // requests
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPoolsRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPoolsRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListPoolsRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForshowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForshowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withName("ShowPool")
                .withUri("/v1/{project_id}/premium-waf/pool/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForupdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForupdatePool() {
        // basic
        HttpRequestDef.Builder<UpdatePoolRequest, UpdatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePoolRequest.class, UpdatePoolResponse.class)
                .withName("UpdatePool")
                .withUri("/v1/{project_id}/premium-waf/pool/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdatePoolRequestBody.class,
            f -> f.withMarshaller(UpdatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
