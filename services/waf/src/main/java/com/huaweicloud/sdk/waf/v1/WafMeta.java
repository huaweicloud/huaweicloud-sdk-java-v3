package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.waf.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class WafMeta {

    public static final HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHost =
        genForapplyCertificateToHost();

    private static HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> genForapplyCertificateToHost() {
        // basic
        HttpRequestDef.Builder<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyCertificateToHostRequest.class, ApplyCertificateToHostResponse.class)
            .withName("ApplyCertificateToHost")
            .withUri("/v1/{project_id}/waf/certificate/{certificate_id}/apply-to-hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ApplyCertificateToHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyCertificateToHostRequestBody.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWaf =
        genForchangePrepaidCloudWaf();

    private static HttpRequestDef<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> genForchangePrepaidCloudWaf() {
        // basic
        HttpRequestDef.Builder<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePrepaidCloudWafRequest.class, ChangePrepaidCloudWafResponse.class)
            .withName("ChangePrepaidCloudWaf")
            .withUri("/v1/{project_id}/waf/subscription/batchalter/prepaid-cloud-waf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePrepaidCloudWafRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ChangePrepaidCloudWafRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePrepaidCloudWafRequestBody.class),
            f -> f.withMarshaller(ChangePrepaidCloudWafRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRule =
        genForcreateAntiTamperRule();

    private static HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> genForcreateAntiTamperRule() {
        // basic
        HttpRequestDef.Builder<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntiTamperRuleRequest.class, CreateAntiTamperRuleResponse.class)
            .withName("CreateAntiTamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateAntiTamperRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiTamperRulesRequestBody.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> createAnticrawlerRule =
        genForcreateAnticrawlerRule();

    private static HttpRequestDef<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> genForcreateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAnticrawlerRuleRequest.class, CreateAnticrawlerRuleResponse.class)
            .withName("CreateAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateAnticrawlerRuleRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnticrawlerRuleRequestbody.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> createAntileakageRule =
        genForcreateAntileakageRule();

    private static HttpRequestDef<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> genForcreateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntileakageRuleRequest.class, CreateAntileakageRuleResponse.class)
            .withName("CreateAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateAntileakageRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntileakageRuleRequestBody.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCcRuleRequestBody.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> createCloudWafPostPaidResource =
        genForcreateCloudWafPostPaidResource();

    private static HttpRequestDef<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> genForcreateCloudWafPostPaidResource() {
        // basic
        HttpRequestDef.Builder<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCloudWafPostPaidResourceRequest.class,
                    CreateCloudWafPostPaidResourceResponse.class)
                .withName("CreateCloudWafPostPaidResource")
                .withUri("/v1/{project_id}/waf/postpaid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<CreateCloudWafPostPaidResourceRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudWafPostPaidResourceRequestbody.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomRuleRequest, CreateCustomRuleResponse> createCustomRule =
        genForcreateCustomRule();

    private static HttpRequestDef<CreateCustomRuleRequest, CreateCustomRuleResponse> genForcreateCustomRule() {
        // basic
        HttpRequestDef.Builder<CreateCustomRuleRequest, CreateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomRuleRequest.class, CreateCustomRuleResponse.class)
                .withName("CreateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateCustomRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomRuleRequestBody.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRule =
        genForcreateGeoipRule();

    private static HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> genForcreateGeoipRule() {
        // basic
        HttpRequestDef.Builder<CreateGeoipRuleRequest, CreateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGeoipRuleRequest.class, CreateGeoipRuleResponse.class)
                .withName("CreateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateGeoIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGeoIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostRequest, CreateHostResponse> createHost = genForcreateHost();

    private static HttpRequestDef<CreateHostRequest, CreateHostResponse> genForcreateHost() {
        // basic
        HttpRequestDef.Builder<CreateHostRequest, CreateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostRequest.class, CreateHostResponse.class)
                .withName("CreateHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostRequestBody.class),
            f -> f.withMarshaller(CreateHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRule =
        genForcreateIgnoreRule();

    private static HttpRequestDef<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> genForcreateIgnoreRule() {
        // basic
        HttpRequestDef.Builder<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIgnoreRuleRequest.class, CreateIgnoreRuleResponse.class)
                .withName("CreateIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/premium-waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup =
        genForcreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForcreateIpGroup() {
        // basic
        HttpRequestDef.Builder<CreateIpGroupRequest, CreateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpGroupRequest.class, CreateIpGroupResponse.class)
                .withName("CreateIpGroup")
                .withUri("/v1/{project_id}/waf/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIpGroupRequestBody.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHost =
        genForcreatePremiumHost();

    private static HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> genForcreatePremiumHost() {
        // basic
        HttpRequestDef.Builder<CreatePremiumHostRequest, CreatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePremiumHostRequest.class, CreatePremiumHostResponse.class)
                .withName("CreatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePremiumHostRequestBody.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWaf =
        genForcreatePrepaidCloudWaf();

    private static HttpRequestDef<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> genForcreatePrepaidCloudWaf() {
        // basic
        HttpRequestDef.Builder<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePrepaidCloudWafRequest.class, CreatePrepaidCloudWafResponse.class)
            .withName("CreatePrepaidCloudWaf")
            .withUri("/v1/{project_id}/waf/subscription/purchase/prepaid-cloud-waf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrepaidCloudWafRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreatePrepaidCloudWafRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrepaidCloudWafRequestBody.class),
            f -> f.withMarshaller(CreatePrepaidCloudWafRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRule =
        genForcreatePrivacyRule();

    private static HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> genForcreatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivacyRuleRequest.class, CreatePrivacyRuleResponse.class)
                .withName("CreatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> createPunishmentRule =
        genForcreatePunishmentRule();

    private static HttpRequestDef<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> genForcreatePunishmentRule() {
        // basic
        HttpRequestDef.Builder<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePunishmentRuleRequest.class, CreatePunishmentRuleResponse.class)
            .withName("CreatePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreatePunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePunishmentRuleRequestBody.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateValueListRequest, CreateValueListResponse> createValueList =
        genForcreateValueList();

    private static HttpRequestDef<CreateValueListRequest, CreateValueListResponse> genForcreateValueList() {
        // basic
        HttpRequestDef.Builder<CreateValueListRequest, CreateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateValueListRequest.class, CreateValueListResponse.class)
                .withName("CreateValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateValueListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateValueListRequestBody.class),
            f -> f.withMarshaller(CreateValueListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRule =
        genForcreateWhiteblackipRule();

    private static HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> genForcreateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWhiteblackipRuleRequest.class, CreateWhiteblackipRuleResponse.class)
            .withName("CreateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CreateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRule =
        genFordeleteAnticrawlerRule();

    private static HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> genFordeleteAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAnticrawlerRuleRequest.class, DeleteAnticrawlerRuleResponse.class)
            .withName("DeleteAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRule =
        genFordeleteAntileakageRule();

    private static HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> genFordeleteAntileakageRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntileakageRuleRequest.class, DeleteAntileakageRuleResponse.class)
            .withName("DeleteAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRule =
        genFordeleteAntitamperRule();

    private static HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> genFordeleteAntitamperRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntitamperRuleRequest.class, DeleteAntitamperRuleResponse.class)
            .withName("DeleteAntitamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

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
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> deleteCloudWafPostPaidResource =
        genFordeleteCloudWafPostPaidResource();

    private static HttpRequestDef<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> genFordeleteCloudWafPostPaidResource() {
        // basic
        HttpRequestDef.Builder<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCloudWafPostPaidResourceRequest.class,
                    DeleteCloudWafPostPaidResourceResponse.class)
                .withName("DeleteCloudWafPostPaidResource")
                .withUri("/v1/{project_id}/waf/postpaid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudWafPostPaidResourceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudWafPostPaidResourceRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRule =
        genFordeleteCustomRule();

    private static HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> genFordeleteCustomRule() {
        // basic
        HttpRequestDef.Builder<DeleteCustomRuleRequest, DeleteCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomRuleRequest.class, DeleteCustomRuleResponse.class)
                .withName("DeleteCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRule =
        genFordeleteGeoipRule();

    private static HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> genFordeleteGeoipRule() {
        // basic
        HttpRequestDef.Builder<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGeoipRuleRequest.class, DeleteGeoipRuleResponse.class)
                .withName("DeleteGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostRequest, DeleteHostResponse> deleteHost = genFordeleteHost();

    private static HttpRequestDef<DeleteHostRequest, DeleteHostResponse> genFordeleteHost() {
        // basic
        HttpRequestDef.Builder<DeleteHostRequest, DeleteHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostRequest.class, DeleteHostResponse.class)
                .withName("DeleteHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRule =
        genFordeleteIgnoreRule();

    private static HttpRequestDef<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> genFordeleteIgnoreRule() {
        // basic
        HttpRequestDef.Builder<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIgnoreRuleRequest.class, DeleteIgnoreRuleResponse.class)
                .withName("DeleteIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genFordeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genFordeleteIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteIpGroupRequest, DeleteIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpGroupRequest.class, DeleteIpGroupResponse.class)
                .withName("DeleteIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

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
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHost =
        genFordeletePremiumHost();

    private static HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> genFordeletePremiumHost() {
        // basic
        HttpRequestDef.Builder<DeletePremiumHostRequest, DeletePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePremiumHostRequest.class, DeletePremiumHostResponse.class)
                .withName("DeletePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Boolean>withRequestField("keepPolicy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getKeepPolicy, (req, v) -> {
                req.setKeepPolicy(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRule =
        genFordeletePrivacyRule();

    private static HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> genFordeletePrivacyRule() {
        // basic
        HttpRequestDef.Builder<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivacyRuleRequest.class, DeletePrivacyRuleResponse.class)
                .withName("DeletePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> deletePunishmentRule =
        genFordeletePunishmentRule();

    private static HttpRequestDef<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> genFordeletePunishmentRule() {
        // basic
        HttpRequestDef.Builder<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePunishmentRuleRequest.class, DeletePunishmentRuleResponse.class)
            .withName("DeletePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> deleteValueList =
        genFordeleteValueList();

    private static HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> genFordeleteValueList() {
        // basic
        HttpRequestDef.Builder<DeleteValueListRequest, DeleteValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteValueListRequest.class, DeleteValueListResponse.class)
                .withName("DeleteValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getValuelistid, (req, v) -> {
                req.setValuelistid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRule =
        genFordeleteWhiteBlackIpRule();

    private static HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> genFordeleteWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWhiteBlackIpRuleRequest.class, DeleteWhiteBlackIpRuleResponse.class)
            .withName("DeleteWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRules =
        genForlistAnticrawlerRules();

    private static HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> genForlistAnticrawlerRules() {
        // basic
        HttpRequestDef.Builder<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAnticrawlerRulesRequest.class, ListAnticrawlerRulesResponse.class)
            .withName("ListAnticrawlerRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRules =
        genForlistAntileakageRules();

    private static HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> genForlistAntileakageRules() {
        // basic
        HttpRequestDef.Builder<ListAntileakageRulesRequest, ListAntileakageRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAntileakageRulesRequest.class, ListAntileakageRulesResponse.class)
            .withName("ListAntileakageRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRule =
        genForlistAntitamperRule();

    private static HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> genForlistAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ListAntitamperRuleRequest, ListAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntitamperRuleRequest.class, ListAntitamperRuleResponse.class)
                .withName("ListAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimeline =
        genForlistBandwidthTimeline();

    private static HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> genForlistBandwidthTimeline() {
        // basic
        HttpRequestDef.Builder<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBandwidthTimelineRequest.class, ListBandwidthTimelineResponse.class)
            .withName("ListBandwidthTimeline")
            .withUri("/v1/{project_id}/waf/overviews/bandwidth/timeline")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            }));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            }));

        // response
        builder.<List<BandwidthStatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthTimelineResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BandwidthStatisticsTimelineItem.class));

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
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getHost, (req, v) -> {
                req.setHost(v);
            }));
        builder.<Integer>withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, (req, v) -> {
                req.setExpStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHosts =
        genForlistCompositeHosts();

    private static HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> genForlistCompositeHosts() {
        // basic
        HttpRequestDef.Builder<ListCompositeHostsRequest, ListCompositeHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCompositeHostsRequest.class, ListCompositeHostsResponse.class)
                .withName("ListCompositeHosts")
                .withUri("/v1/{project_id}/composite-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            }));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            }));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));
        builder.<String>withRequestField("waf_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getWafType, (req, v) -> {
                req.setWafType(v);
            }));
        builder.<Boolean>withRequestField("is_https",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getIsHttps, (req, v) -> {
                req.setIsHttps(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRules =
        genForlistCustomRules();

    private static HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> genForlistCustomRules() {
        // basic
        HttpRequestDef.Builder<ListCustomRulesRequest, ListCustomRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomRulesRequest.class, ListCustomRulesResponse.class)
                .withName("ListCustomRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventRequest, ListEventResponse> listEvent = genForlistEvent();

    private static HttpRequestDef<ListEventRequest, ListEventResponse> genForlistEvent() {
        // basic
        HttpRequestDef.Builder<ListEventRequest, ListEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventRequest.class, ListEventResponse.class)
                .withName("ListEvent")
                .withUri("/v1/{project_id}/waf/event")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ListEventRequest.RecentEnum>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventRequest.RecentEnum.class),
            f -> f.withMarshaller(ListEventRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<List<String>>withRequestField("attacks",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getAttacks, (req, v) -> {
                req.setAttacks(v);
            }));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRule =
        genForlistGeoipRule();

    private static HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> genForlistGeoipRule() {
        // basic
        HttpRequestDef.Builder<ListGeoipRuleRequest, ListGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGeoipRuleRequest.class, ListGeoipRuleResponse.class)
                .withName("ListGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRequest, ListHostResponse> listHost = genForlistHost();

    private static HttpRequestDef<ListHostRequest, ListHostResponse> genForlistHost() {
        // basic
        HttpRequestDef.Builder<ListHostRequest, ListHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRequest.class, ListHostResponse.class)
                .withName("ListHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            }));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> listHostRoute =
        genForlistHostRoute();

    private static HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> genForlistHostRoute() {
        // basic
        HttpRequestDef.Builder<ListHostRouteRequest, ListHostRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRouteRequest.class, ListHostRouteResponse.class)
                .withName("ListHostRoute")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}/route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRule =
        genForlistIgnoreRule();

    private static HttpRequestDef<ListIgnoreRuleRequest, ListIgnoreRuleResponse> genForlistIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ListIgnoreRuleRequest, ListIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIgnoreRuleRequest.class, ListIgnoreRuleResponse.class)
                .withName("ListIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

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
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("instancename",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getInstancename, (req, v) -> {
                req.setInstancename(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupRequest, ListIpGroupResponse> listIpGroup = genForlistIpGroup();

    private static HttpRequestDef<ListIpGroupRequest, ListIpGroupResponse> genForlistIpGroup() {
        // basic
        HttpRequestDef.Builder<ListIpGroupRequest, ListIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpGroupRequest.class, ListIpGroupResponse.class)
                .withName("ListIpGroup")
                .withUri("/v1/{project_id}/waf/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigs =
        genForlistNoticeConfigs();

    private static HttpRequestDef<ListNoticeConfigsRequest, ListNoticeConfigsResponse> genForlistNoticeConfigs() {
        // basic
        HttpRequestDef.Builder<ListNoticeConfigsRequest, ListNoticeConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeConfigsRequest.class, ListNoticeConfigsResponse.class)
                .withName("ListNoticeConfigs")
                .withUri("/v2/{project_id}/waf/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeConfigsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassification =
        genForlistOverviewsClassification();

    private static HttpRequestDef<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> genForlistOverviewsClassification() {
        // basic
        HttpRequestDef.Builder<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOverviewsClassificationRequest.class,
                    ListOverviewsClassificationResponse.class)
                .withName("ListOverviewsClassification")
                .withUri("/v1/{project_id}/waf/overviews/classification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getTop, (req, v) -> {
                req.setTop(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            }));

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
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHost =
        genForlistPremiumHost();

    private static HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> genForlistPremiumHost() {
        // basic
        HttpRequestDef.Builder<ListPremiumHostRequest, ListPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPremiumHostRequest.class, ListPremiumHostResponse.class)
                .withName("ListPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<String>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            }));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            }));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRule =
        genForlistPrivacyRule();

    private static HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> genForlistPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ListPrivacyRuleRequest, ListPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivacyRuleRequest.class, ListPrivacyRuleResponse.class)
                .withName("ListPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPunishmentRulesRequest, ListPunishmentRulesResponse> listPunishmentRules =
        genForlistPunishmentRules();

    private static HttpRequestDef<ListPunishmentRulesRequest, ListPunishmentRulesResponse> genForlistPunishmentRules() {
        // basic
        HttpRequestDef.Builder<ListPunishmentRulesRequest, ListPunishmentRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPunishmentRulesRequest.class, ListPunishmentRulesResponse.class)
                .withName("ListPunishmentRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimeline =
        genForlistQpsTimeline();

    private static HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> genForlistQpsTimeline() {
        // basic
        HttpRequestDef.Builder<ListQpsTimelineRequest, ListQpsTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQpsTimelineRequest.class, ListQpsTimelineResponse.class)
                .withName("ListQpsTimeline")
                .withUri("/v1/{project_id}/waf/overviews/qps/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            }));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            }));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQpsTimelineResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimeline =
        genForlistRequestTimeline();

    private static HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> genForlistRequestTimeline() {
        // basic
        HttpRequestDef.Builder<ListRequestTimelineRequest, ListRequestTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestTimelineRequest.class, ListRequestTimelineResponse.class)
                .withName("ListRequestTimeline")
                .withUri("/v1/{project_id}/waf/overviews/request/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<List<String>>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            }));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            }));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForlistStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForlistStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v1/{project_id}/waf/overviews/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListStatisticsRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListStatisticsRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            }));

        // response
        builder.<List<CountItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStatisticsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CountItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormal =
        genForlistTopAbnormal();

    private static HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> genForlistTopAbnormal() {
        // basic
        HttpRequestDef.Builder<ListTopAbnormalRequest, ListTopAbnormalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopAbnormalRequest.class, ListTopAbnormalResponse.class)
                .withName("ListTopAbnormal")
                .withUri("/v1/{project_id}/waf/overviews/abnormal")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getTop, (req, v) -> {
                req.setTop(v);
            }));
        builder.<Integer>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getCode, (req, v) -> {
                req.setCode(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getInstances, (req, v) -> {
                req.setInstances(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListValueListRequest, ListValueListResponse> listValueList =
        genForlistValueList();

    private static HttpRequestDef<ListValueListRequest, ListValueListResponse> genForlistValueList() {
        // basic
        HttpRequestDef.Builder<ListValueListRequest, ListValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListValueListRequest.class, ListValueListResponse.class)
                .withName("ListValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListValueListRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRule =
        genForlistWhiteblackipRule();

    private static HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> genForlistWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWhiteblackipRuleRequest.class, ListWhiteblackipRuleResponse.class)
            .withName("ListWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHosts =
        genFormigrateCompositeHosts();

    private static HttpRequestDef<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> genFormigrateCompositeHosts() {
        // basic
        HttpRequestDef.Builder<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, MigrateCompositeHostsRequest.class, MigrateCompositeHostsResponse.class)
            .withName("MigrateCompositeHosts")
            .withUri("/v1/{project_id}/composite-waf/hosts/migration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("target_enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getTargetEnterpriseProjectId, (req, v) -> {
                req.setTargetEnterpriseProjectId(v);
            }));
        builder.<MigrateCompositeHostsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateCompositeHostsRequestBody.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameInstanceRequest, RenameInstanceResponse> renameInstance =
        genForrenameInstance();

    private static HttpRequestDef<RenameInstanceRequest, RenameInstanceResponse> genForrenameInstance() {
        // basic
        HttpRequestDef.Builder<RenameInstanceRequest, RenameInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameInstanceRequest.class, RenameInstanceResponse.class)
                .withName("RenameInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<RenameInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RenameInstanceRequestBody.class),
            f -> f.withMarshaller(RenameInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRule =
        genForshowAnticrawlerRule();

    private static HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> genForshowAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAnticrawlerRuleRequest.class, ShowAnticrawlerRuleResponse.class)
                .withName("ShowAnticrawlerRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRule =
        genForshowAntileakageRule();

    private static HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> genForshowAntileakageRule() {
        // basic
        HttpRequestDef.Builder<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntileakageRuleRequest.class, ShowAntileakageRuleResponse.class)
                .withName("ShowAntileakageRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> showAntitamperRule =
        genForshowAntitamperRule();

    private static HttpRequestDef<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> genForshowAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntitamperRuleRequest.class, ShowAntitamperRuleResponse.class)
                .withName("ShowAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

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
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHost =
        genForshowCompositeHost();

    private static HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> genForshowCompositeHost() {
        // basic
        HttpRequestDef.Builder<ShowCompositeHostRequest, ShowCompositeHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCompositeHostRequest.class, ShowCompositeHostResponse.class)
                .withName("ShowCompositeHost")
                .withUri("/v1/{project_id}/composite-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfig =
        genForshowConsoleConfig();

    private static HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> genForshowConsoleConfig() {
        // basic
        HttpRequestDef.Builder<ShowConsoleConfigRequest, ShowConsoleConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConsoleConfigRequest.class, ShowConsoleConfigResponse.class)
                .withName("ShowConsoleConfig")
                .withUri("/v1/{project_id}/waf/config/console")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRule =
        genForshowCustomRule();

    private static HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> genForshowCustomRule() {
        // basic
        HttpRequestDef.Builder<ShowCustomRuleRequest, ShowCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomRuleRequest.class, ShowCustomRuleResponse.class)
                .withName("ShowCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForshowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForshowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v1/{project_id}/waf/event/{eventid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventid, (req, v) -> {
                req.setEventid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRule =
        genForshowGeoipRule();

    private static HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> genForshowGeoipRule() {
        // basic
        HttpRequestDef.Builder<ShowGeoipRuleRequest, ShowGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGeoipRuleRequest.class, ShowGeoipRuleResponse.class)
                .withName("ShowGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostRequest, ShowHostResponse> showHost = genForshowHost();

    private static HttpRequestDef<ShowHostRequest, ShowHostResponse> genForshowHost() {
        // basic
        HttpRequestDef.Builder<ShowHostRequest, ShowHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHostRequest.class, ShowHostResponse.class)
                .withName("ShowHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> showIgnoreRule =
        genForshowIgnoreRule();

    private static HttpRequestDef<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> genForshowIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIgnoreRuleRequest.class, ShowIgnoreRuleResponse.class)
                .withName("ShowIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForshowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForshowIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowIpGroupRequest, ShowIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpGroupRequest.class, ShowIpGroupResponse.class)
                .withName("ShowIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfig =
        genForshowLtsInfoConfig();

    private static HttpRequestDef<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> genForshowLtsInfoConfig() {
        // basic
        HttpRequestDef.Builder<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLtsInfoConfigRequest.class, ShowLtsInfoConfigResponse.class)
                .withName("ShowLtsInfoConfig")
                .withUri("/v1/{project_id}/waf/config/lts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsInfoConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForshowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForshowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHost =
        genForshowPremiumHost();

    private static HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> genForshowPremiumHost() {
        // basic
        HttpRequestDef.Builder<ShowPremiumHostRequest, ShowPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPremiumHostRequest.class, ShowPremiumHostResponse.class)
                .withName("ShowPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> showPrivacyRule =
        genForshowPrivacyRule();

    private static HttpRequestDef<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> genForshowPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivacyRuleRequest.class, ShowPrivacyRuleResponse.class)
                .withName("ShowPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> showPunishmentRule =
        genForshowPunishmentRule();

    private static HttpRequestDef<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> genForshowPunishmentRule() {
        // basic
        HttpRequestDef.Builder<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPunishmentRuleRequest.class, ShowPunishmentRuleResponse.class)
                .withName("ShowPunishmentRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIp = genForshowSourceIp();

    private static HttpRequestDef<ShowSourceIpRequest, ShowSourceIpResponse> genForshowSourceIp() {
        // basic
        HttpRequestDef.Builder<ShowSourceIpRequest, ShowSourceIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSourceIpRequest.class, ShowSourceIpResponse.class)
                .withName("ShowSourceIp")
                .withUri("/v1/{project_id}/waf/config/source-ip")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfo =
        genForshowSubscriptionInfo();

    private static HttpRequestDef<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> genForshowSubscriptionInfo() {
        // basic
        HttpRequestDef.Builder<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSubscriptionInfoRequest.class, ShowSubscriptionInfoResponse.class)
            .withName("ShowSubscriptionInfo")
            .withUri("/v1/{project_id}/waf/subscription")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowValueListRequest, ShowValueListResponse> showValueList =
        genForshowValueList();

    private static HttpRequestDef<ShowValueListRequest, ShowValueListResponse> genForshowValueList() {
        // basic
        HttpRequestDef.Builder<ShowValueListRequest, ShowValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowValueListRequest.class, ShowValueListResponse.class)
                .withName("ShowValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowValueListRequest::getValuelistid, (req, v) -> {
                req.setValuelistid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowValueListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> showWhiteBlackIpRule =
        genForshowWhiteBlackIpRule();

    private static HttpRequestDef<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> genForshowWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWhiteBlackIpRuleRequest.class, ShowWhiteBlackIpRuleResponse.class)
            .withName("ShowWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfig =
        genForupdateAlertNoticeConfig();

    private static HttpRequestDef<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> genForupdateAlertNoticeConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAlertNoticeConfigRequest.class, UpdateAlertNoticeConfigResponse.class)
            .withName("UpdateAlertNoticeConfig")
            .withUri("/v2/{project_id}/waf/alert/{alert_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getAlertId, (req, v) -> {
                req.setAlertId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateAlertNoticeConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertNoticeConfigRequestBody.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> updateAntiTamperRuleRefresh =
        genForupdateAntiTamperRuleRefresh();

    private static HttpRequestDef<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> genForupdateAntiTamperRuleRefresh() {
        // basic
        HttpRequestDef.Builder<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAntiTamperRuleRefreshRequest.class,
                    UpdateAntiTamperRuleRefreshResponse.class)
                .withName("UpdateAntiTamperRuleRefresh")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}/refresh")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRule =
        genForupdateAnticrawlerRule();

    private static HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> genForupdateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAnticrawlerRuleRequest.class, UpdateAnticrawlerRuleResponse.class)
            .withName("UpdateAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateAnticrawlerRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnticrawlerRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> updateAnticrawlerRuleType =
        genForupdateAnticrawlerRuleType();

    private static HttpRequestDef<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> genForupdateAnticrawlerRuleType() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAnticrawlerRuleTypeRequest.class,
                    UpdateAnticrawlerRuleTypeResponse.class)
                .withName("UpdateAnticrawlerRuleType")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateAnticrawlerRuleTypeRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnticrawlerRuleTypeRequestbody.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRule =
        genForupdateAntileakageRule();

    private static HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> genForupdateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAntileakageRuleRequest.class, UpdateAntileakageRuleResponse.class)
            .withName("UpdateAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateAntileakageRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAntileakageRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCcRuleRequestBody.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRule =
        genForupdateCustomRule();

    private static HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> genForupdateCustomRule() {
        // basic
        HttpRequestDef.Builder<UpdateCustomRuleRequest, UpdateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomRuleRequest.class, UpdateCustomRuleResponse.class)
                .withName("UpdateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateCustomRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCustomRuleRequestBody.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRule =
        genForupdateGeoipRule();

    private static HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> genForupdateGeoipRule() {
        // basic
        HttpRequestDef.Builder<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGeoipRuleRequest.class, UpdateGeoipRuleResponse.class)
                .withName("UpdateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateGeoipRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGeoipRuleRequestBody.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostRequest, UpdateHostResponse> updateHost = genForupdateHost();

    private static HttpRequestDef<UpdateHostRequest, UpdateHostResponse> genForupdateHost() {
        // basic
        HttpRequestDef.Builder<UpdateHostRequest, UpdateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateHostRequest.class, UpdateHostResponse.class)
                .withName("UpdateHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostRequestBody.class),
            f -> f.withMarshaller(UpdateHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatus =
        genForupdateHostProtectStatus();

    private static HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> genForupdateHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHostProtectStatusRequest.class, UpdateHostProtectStatusResponse.class)
            .withName("UpdateHostProtectStatus")
            .withUri("/v1/{project_id}/waf/instance/{instance_id}/protect-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> updateIgnoreRule =
        genForupdateIgnoreRule();

    private static HttpRequestDef<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> genForupdateIgnoreRule() {
        // basic
        HttpRequestDef.Builder<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIgnoreRuleRequest.class, UpdateIgnoreRuleResponse.class)
                .withName("UpdateIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup =
        genForupdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForupdateIpGroup() {
        // basic
        HttpRequestDef.Builder<UpdateIpGroupRequest, UpdateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpGroupRequest.class, UpdateIpGroupResponse.class)
                .withName("UpdateIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfig =
        genForupdateLtsInfoConfig();

    private static HttpRequestDef<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> genForupdateLtsInfoConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLtsInfoConfigRequest.class, UpdateLtsInfoConfigResponse.class)
                .withName("UpdateLtsInfoConfig")
                .withUri("/v1/{project_id}/waf/config/lts/{ltsconfig_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ltsconfig_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getLtsconfigId, (req, v) -> {
                req.setLtsconfigId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateLtsInfoConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLtsInfoConfigRequestBody.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForupdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForupdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHost =
        genForupdatePolicyProtectHost();

    private static HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> genForupdatePolicyProtectHost() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyProtectHostRequest.class, UpdatePolicyProtectHostResponse.class)
            .withName("UpdatePolicyProtectHost")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatus =
        genForupdatePolicyRuleStatus();

    private static HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> genForupdatePolicyRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyRuleStatusRequest.class, UpdatePolicyRuleStatusResponse.class)
            .withName("UpdatePolicyRuleStatus")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/{ruletype}/{rule_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<UpdatePolicyRuleStatusRequest.RuletypeEnum>withRequestField("ruletype",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequest.RuletypeEnum.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuletype, (req, v) -> {
                req.setRuletype(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdatePolicyRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHost =
        genForupdatePremiumHost();

    private static HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> genForupdatePremiumHost() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostRequest, UpdatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostRequest.class, UpdatePremiumHostResponse.class)
                .withName("UpdatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatus =
        genForupdatePremiumHostProtectStatus();

    private static HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> genForupdatePremiumHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePremiumHostProtectStatusRequest.class,
                    UpdatePremiumHostProtectStatusResponse.class)
                .withName("UpdatePremiumHostProtectStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/protect-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdatePremiumHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRule =
        genForupdatePrivacyRule();

    private static HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> genForupdatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivacyRuleRequest.class, UpdatePrivacyRuleResponse.class)
                .withName("UpdatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> updatePunishmentRule =
        genForupdatePunishmentRule();

    private static HttpRequestDef<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> genForupdatePunishmentRule() {
        // basic
        HttpRequestDef.Builder<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePunishmentRuleRequest.class, UpdatePunishmentRuleResponse.class)
            .withName("UpdatePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdatePunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePunishmentRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> updateValueList =
        genForupdateValueList();

    private static HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> genForupdateValueList() {
        // basic
        HttpRequestDef.Builder<UpdateValueListRequest, UpdateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateValueListRequest.class, UpdateValueListResponse.class)
                .withName("UpdateValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getValuelistid, (req, v) -> {
                req.setValuelistid(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateValueListRequestBody.class),
            f -> f.withMarshaller(UpdateValueListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRule =
        genForupdateWhiteblackipRule();

    private static HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> genForupdateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWhiteblackipRuleRequest.class, UpdateWhiteblackipRuleResponse.class)
            .withName("UpdateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
