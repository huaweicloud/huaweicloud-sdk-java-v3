package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.elb.v3.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class ElbMeta {

    public static final HttpRequestDef<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembers =
        genForbatchCreateMembers();

    private static HttpRequestDef<BatchCreateMembersRequest, BatchCreateMembersResponse> genForbatchCreateMembers() {
        // basic
        HttpRequestDef.Builder<BatchCreateMembersRequest, BatchCreateMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateMembersRequest.class, BatchCreateMembersResponse.class)
                .withName("BatchCreateMembers")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/batch-add")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<BatchCreateMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateMembersRequestBody.class),
            f -> f.withMarshaller(BatchCreateMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembers =
        genForbatchDeleteMembers();

    private static HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> genForbatchDeleteMembers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMembersRequest, BatchDeleteMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteMembersRequest.class, BatchDeleteMembersResponse.class)
                .withName("BatchDeleteMembers")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<BatchDeleteMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMembersRequestBody.class),
            f -> f.withMarshaller(BatchDeleteMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembers =
        genForbatchUpdateMembers();

    private static HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> genForbatchUpdateMembers() {
        // basic
        HttpRequestDef.Builder<BatchUpdateMembersRequest, BatchUpdateMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateMembersRequest.class, BatchUpdateMembersResponse.class)
                .withName("BatchUpdateMembers")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/batch-update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<BatchUpdateMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateMembersRequestBody.class),
            f -> f.withMarshaller(BatchUpdateMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriority =
        genForbatchUpdatePoliciesPriority();

    private static HttpRequestDef<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> genForbatchUpdatePoliciesPriority() {
        // basic
        HttpRequestDef.Builder<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpdatePoliciesPriorityRequest.class,
                    BatchUpdatePoliciesPriorityResponse.class)
                .withName("BatchUpdatePoliciesPriority")
                .withUri("/v3/{project_id}/elb/l7policies/batch-update-priority")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchUpdatePoliciesPriorityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchUpdatePoliciesPriorityRequestBody.class),
            f -> f.withMarshaller(BatchUpdatePoliciesPriorityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeMode =
        genForchangeLoadbalancerChargeMode();

    private static HttpRequestDef<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> genForchangeLoadbalancerChargeMode() {
        // basic
        HttpRequestDef.Builder<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeLoadbalancerChargeModeRequest.class,
                    ChangeLoadbalancerChargeModeResponse.class)
                .withName("ChangeLoadbalancerChargeMode")
                .withUri("/v3/{project_id}/elb/loadbalancers/change-charge-mode")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeLoadbalancerChargeModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeLoadbalancerChargeModeRequestBody.class),
            f -> f.withMarshaller(ChangeLoadbalancerChargeModeRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/elb/certificates")
                .withContentType("application/json;charset=UTF-8");

        // requests
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

    public static final HttpRequestDef<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitor =
        genForcreateHealthMonitor();

    private static HttpRequestDef<CreateHealthMonitorRequest, CreateHealthMonitorResponse> genForcreateHealthMonitor() {
        // basic
        HttpRequestDef.Builder<CreateHealthMonitorRequest, CreateHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHealthMonitorRequest.class, CreateHealthMonitorResponse.class)
                .withName("CreateHealthMonitor")
                .withUri("/v3/{project_id}/elb/healthmonitors")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateHealthMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHealthMonitorRequestBody.class),
            f -> f.withMarshaller(CreateHealthMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7Policy =
        genForcreateL7Policy();

    private static HttpRequestDef<CreateL7PolicyRequest, CreateL7PolicyResponse> genForcreateL7Policy() {
        // basic
        HttpRequestDef.Builder<CreateL7PolicyRequest, CreateL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7PolicyRequest.class, CreateL7PolicyResponse.class)
                .withName("CreateL7Policy")
                .withUri("/v3/{project_id}/elb/l7policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateL7PolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateL7PolicyRequestBody.class),
            f -> f.withMarshaller(CreateL7PolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7RuleRequest, CreateL7RuleResponse> createL7Rule = genForcreateL7Rule();

    private static HttpRequestDef<CreateL7RuleRequest, CreateL7RuleResponse> genForcreateL7Rule() {
        // basic
        HttpRequestDef.Builder<CreateL7RuleRequest, CreateL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7RuleRequest.class, CreateL7RuleResponse.class)
                .withName("CreateL7Rule")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<CreateL7RuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateL7RuleRequestBody.class),
            f -> f.withMarshaller(CreateL7RuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener =
        genForcreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForcreateListener() {
        // basic
        HttpRequestDef.Builder<CreateListenerRequest, CreateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateListenerRequest.class, CreateListenerResponse.class)
                .withName("CreateListener")
                .withUri("/v3/{project_id}/elb/listeners")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateListenerRequestBody.class),
            f -> f.withMarshaller(CreateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancer =
        genForcreateLoadBalancer();

    private static HttpRequestDef<CreateLoadBalancerRequest, CreateLoadBalancerResponse> genForcreateLoadBalancer() {
        // basic
        HttpRequestDef.Builder<CreateLoadBalancerRequest, CreateLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoadBalancerRequest.class, CreateLoadBalancerResponse.class)
                .withName("CreateLoadBalancer")
                .withUri("/v3/{project_id}/elb/loadbalancers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateLoadBalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLoadBalancerRequestBody.class),
            f -> f.withMarshaller(CreateLoadBalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> createLogtank =
        genForcreateLogtank();

    private static HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> genForcreateLogtank() {
        // basic
        HttpRequestDef.Builder<CreateLogtankRequest, CreateLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogtankRequest.class, CreateLogtankResponse.class)
                .withName("CreateLogtank")
                .withUri("/v3/{project_id}/elb/logtanks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogtankRequestBody.class),
            f -> f.withMarshaller(CreateLogtankRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberRequest, CreateMemberResponse> createMember = genForcreateMember();

    private static HttpRequestDef<CreateMemberRequest, CreateMemberResponse> genForcreateMember() {
        // basic
        HttpRequestDef.Builder<CreateMemberRequest, CreateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMemberRequest.class, CreateMemberResponse.class)
                .withName("CreateMember")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<CreateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMemberRequestBody.class),
            f -> f.withMarshaller(CreateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForcreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForcreatePool() {
        // basic
        HttpRequestDef.Builder<CreatePoolRequest, CreatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolRequest.class, CreatePoolResponse.class)
                .withName("CreatePool")
                .withUri("/v3/{project_id}/elb/pools")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePoolRequestBody.class),
            f -> f.withMarshaller(CreatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicy =
        genForcreateSecurityPolicy();

    private static HttpRequestDef<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> genForcreateSecurityPolicy() {
        // basic
        HttpRequestDef.Builder<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSecurityPolicyRequest.class, CreateSecurityPolicyResponse.class)
            .withName("CreateSecurityPolicy")
            .withUri("/v3/{project_id}/elb/security-policies")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSecurityPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityPolicyRequestBody.class),
            f -> f.withMarshaller(CreateSecurityPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v3/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitor =
        genFordeleteHealthMonitor();

    private static HttpRequestDef<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> genFordeleteHealthMonitor() {
        // basic
        HttpRequestDef.Builder<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHealthMonitorRequest.class, DeleteHealthMonitorResponse.class)
            .withName("DeleteHealthMonitor")
            .withUri("/v3/{project_id}/elb/healthmonitors/{healthmonitor_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHealthMonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7Policy =
        genFordeleteL7Policy();

    private static HttpRequestDef<DeleteL7PolicyRequest, DeleteL7PolicyResponse> genFordeleteL7Policy() {
        // basic
        HttpRequestDef.Builder<DeleteL7PolicyRequest, DeleteL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7PolicyRequest.class, DeleteL7PolicyResponse.class)
                .withName("DeleteL7Policy")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7PolicyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7Rule = genFordeleteL7Rule();

    private static HttpRequestDef<DeleteL7RuleRequest, DeleteL7RuleResponse> genFordeleteL7Rule() {
        // basic
        HttpRequestDef.Builder<DeleteL7RuleRequest, DeleteL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7RuleRequest.class, DeleteL7RuleResponse.class)
                .withName("DeleteL7Rule")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7RuleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener =
        genFordeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genFordeleteListener() {
        // basic
        HttpRequestDef.Builder<DeleteListenerRequest, DeleteListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteListenerRequest.class, DeleteListenerResponse.class)
                .withName("DeleteListener")
                .withUri("/v3/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerForceRequest, DeleteListenerForceResponse> deleteListenerForce =
        genFordeleteListenerForce();

    private static HttpRequestDef<DeleteListenerForceRequest, DeleteListenerForceResponse> genFordeleteListenerForce() {
        // basic
        HttpRequestDef.Builder<DeleteListenerForceRequest, DeleteListenerForceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteListenerForceRequest.class, DeleteListenerForceResponse.class)
            .withName("DeleteListenerForce")
            .withUri("/v3/{project_id}/elb/listeners/{listener_id}/force")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerForceRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancer =
        genFordeleteLoadBalancer();

    private static HttpRequestDef<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> genFordeleteLoadBalancer() {
        // basic
        HttpRequestDef.Builder<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLoadBalancerRequest.class, DeleteLoadBalancerResponse.class)
                .withName("DeleteLoadBalancer")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadBalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> deleteLoadBalancerForce =
        genFordeleteLoadBalancerForce();

    private static HttpRequestDef<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> genFordeleteLoadBalancerForce() {
        // basic
        HttpRequestDef.Builder<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLoadBalancerForceRequest.class, DeleteLoadBalancerForceResponse.class)
            .withName("DeleteLoadBalancerForce")
            .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/force-elb")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadBalancerForceRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtank =
        genFordeleteLogtank();

    private static HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> genFordeleteLogtank() {
        // basic
        HttpRequestDef.Builder<DeleteLogtankRequest, DeleteLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogtankRequest.class, DeleteLogtankResponse.class)
                .withName("DeleteLogtank")
                .withUri("/v3/{project_id}/elb/logtanks/{logtank_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogtankRequest::getLogtankId, (req, v) -> {
                req.setLogtankId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withName("DeleteMember")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genFordeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genFordeletePool() {
        // basic
        HttpRequestDef.Builder<DeletePoolRequest, DeletePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolRequest.class, DeletePoolResponse.class)
                .withName("DeletePool")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicy =
        genFordeleteSecurityPolicy();

    private static HttpRequestDef<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> genFordeleteSecurityPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityPolicyRequest.class, DeleteSecurityPolicyResponse.class)
            .withName("DeleteSecurityPolicy")
            .withUri("/v3/{project_id}/elb/security-policies/{security_policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityPolicyRequest::getSecurityPolicyId, (req, v) -> {
                req.setSecurityPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllMembersRequest, ListAllMembersResponse> listAllMembers =
        genForlistAllMembers();

    private static HttpRequestDef<ListAllMembersRequest, ListAllMembersResponse> genForlistAllMembers() {
        // basic
        HttpRequestDef.Builder<ListAllMembersRequest, ListAllMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllMembersRequest.class, ListAllMembersResponse.class)
                .withName("ListAllMembers")
                .withUri("/v3/{project_id}/elb/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllMembersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllMembersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllMembersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<Integer>>withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getWeight, (req, v) -> {
                req.setWeight(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllMembersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getSubnetCidrId, (req, v) -> {
                req.setSubnetCidrId(v);
            }));
        builder.<List<String>>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<List<Integer>>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<List<String>>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForlistAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForlistAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v3/{project_id}/elb/availability-zones")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailabilityZonesRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
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
                .withUri("/v3/{project_id}/elb/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/elb/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlavorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Boolean>withRequestField("shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlavorsRequest::getShared, (req, v) -> {
                req.setShared(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitors =
        genForlistHealthMonitors();

    private static HttpRequestDef<ListHealthMonitorsRequest, ListHealthMonitorsResponse> genForlistHealthMonitors() {
        // basic
        HttpRequestDef.Builder<ListHealthMonitorsRequest, ListHealthMonitorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHealthMonitorsRequest.class, ListHealthMonitorsResponse.class)
                .withName("ListHealthMonitors")
                .withUri("/v3/{project_id}/elb/healthmonitors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<Integer>>withRequestField("monitor_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMonitorPort, (req, v) -> {
                req.setMonitorPort(v);
            }));
        builder.<List<String>>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<Integer>>withRequestField("delay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getDelay, (req, v) -> {
                req.setDelay(v);
            }));
        builder.<List<Integer>>withRequestField("max_retries",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMaxRetries, (req, v) -> {
                req.setMaxRetries(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<Integer>>withRequestField("max_retries_down",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMaxRetriesDown, (req, v) -> {
                req.setMaxRetriesDown(v);
            }));
        builder.<Integer>withRequestField("timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getTimeout, (req, v) -> {
                req.setTimeout(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("expected_codes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getExpectedCodes, (req, v) -> {
                req.setExpectedCodes(v);
            }));
        builder.<List<String>>withRequestField("url_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getUrlPath, (req, v) -> {
                req.setUrlPath(v);
            }));
        builder.<List<String>>withRequestField("http_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getHttpMethod, (req, v) -> {
                req.setHttpMethod(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7Policies =
        genForlistL7Policies();

    private static HttpRequestDef<ListL7PoliciesRequest, ListL7PoliciesResponse> genForlistL7Policies() {
        // basic
        HttpRequestDef.Builder<ListL7PoliciesRequest, ListL7PoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7PoliciesRequest.class, ListL7PoliciesResponse.class)
                .withName("ListL7Policies")
                .withUri("/v3/{project_id}/elb/l7policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<List<Integer>>withRequestField("position",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getPosition, (req, v) -> {
                req.setPosition(v);
            }));
        builder.<List<String>>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<List<String>>withRequestField("redirect_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectUrl, (req, v) -> {
                req.setRedirectUrl(v);
            }));
        builder.<List<String>>withRequestField("redirect_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectPoolId, (req, v) -> {
                req.setRedirectPoolId(v);
            }));
        builder.<List<String>>withRequestField("redirect_listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectListenerId, (req, v) -> {
                req.setRedirectListenerId(v);
            }));
        builder.<List<String>>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));
        builder.<Boolean>withRequestField("display_all_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getDisplayAllRules, (req, v) -> {
                req.setDisplayAllRules(v);
            }));
        builder.<List<Integer>>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getPriority, (req, v) -> {
                req.setPriority(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7RulesRequest, ListL7RulesResponse> listL7Rules = genForlistL7Rules();

    private static HttpRequestDef<ListL7RulesRequest, ListL7RulesResponse> genForlistL7Rules() {
        // basic
        HttpRequestDef.Builder<ListL7RulesRequest, ListL7RulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7RulesRequest.class, ListL7RulesResponse.class)
                .withName("ListL7Rules")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7RulesRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7RulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7RulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7RulesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getCompareType, (req, v) -> {
                req.setCompareType(v);
            }));
        builder.<List<String>>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));
        builder.<Boolean>withRequestField("invert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7RulesRequest::getInvert, (req, v) -> {
                req.setInvert(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7RulesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getValue, (req, v) -> {
                req.setValue(v);
            }));
        builder.<List<String>>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners =
        genForlistListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForlistListeners() {
        // basic
        HttpRequestDef.Builder<ListListenersRequest, ListListenersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListListenersRequest.class, ListListenersResponse.class)
                .withName("ListListeners")
                .withUri("/v3/{project_id}/elb/listeners")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            }));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("default_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultTlsContainerRef, (req, v) -> {
                req.setDefaultTlsContainerRef(v);
            }));
        builder.<List<String>>withRequestField("client_ca_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getClientCaTlsContainerRef, (req, v) -> {
                req.setClientCaTlsContainerRef(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<Integer>>withRequestField("connection_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getConnectionLimit, (req, v) -> {
                req.setConnectionLimit(v);
            }));
        builder.<List<String>>withRequestField("default_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultPoolId, (req, v) -> {
                req.setDefaultPoolId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("http2_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getHttp2Enable, (req, v) -> {
                req.setHttp2Enable(v);
            }));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<List<String>>withRequestField("tls_ciphers_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getTlsCiphersPolicy, (req, v) -> {
                req.setTlsCiphersPolicy(v);
            }));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            }));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Boolean>withRequestField("enable_member_retry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getEnableMemberRetry, (req, v) -> {
                req.setEnableMemberRetry(v);
            }));
        builder.<List<Integer>>withRequestField("member_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberTimeout, (req, v) -> {
                req.setMemberTimeout(v);
            }));
        builder.<List<Integer>>withRequestField("client_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getClientTimeout, (req, v) -> {
                req.setClientTimeout(v);
            }));
        builder.<List<Integer>>withRequestField("keepalive_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getKeepaliveTimeout, (req, v) -> {
                req.setKeepaliveTimeout(v);
            }));
        builder.<Boolean>withRequestField("transparent_client_ip_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getTransparentClientIpEnable, (req, v) -> {
                req.setTransparentClientIpEnable(v);
            }));
        builder.<Boolean>withRequestField("enhance_l7policy_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getEnhanceL7policyEnable, (req, v) -> {
                req.setEnhanceL7policyEnable(v);
            }));
        builder.<List<String>>withRequestField("member_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberInstanceId, (req, v) -> {
                req.setMemberInstanceId(v);
            }));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getProtectionStatus, (req, v) -> {
                req.setProtectionStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancers =
        genForlistLoadBalancers();

    private static HttpRequestDef<ListLoadBalancersRequest, ListLoadBalancersResponse> genForlistLoadBalancers() {
        // basic
        HttpRequestDef.Builder<ListLoadBalancersRequest, ListLoadBalancersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoadBalancersRequest.class, ListLoadBalancersResponse.class)
                .withName("ListLoadBalancers")
                .withUri("/v3/{project_id}/elb/loadbalancers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            }));
        builder.<Boolean>withRequestField("guaranteed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getGuaranteed, (req, v) -> {
                req.setGuaranteed(v);
            }));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<List<String>>withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipPortId, (req, v) -> {
                req.setVipPortId(v);
            }));
        builder.<List<String>>withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipAddress, (req, v) -> {
                req.setVipAddress(v);
            }));
        builder.<List<String>>withRequestField("vip_subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipSubnetCidrId, (req, v) -> {
                req.setVipSubnetCidrId(v);
            }));
        builder.<List<String>>withRequestField("ipv6_vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipPortId, (req, v) -> {
                req.setIpv6VipPortId(v);
            }));
        builder.<List<String>>withRequestField("ipv6_vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipAddress, (req, v) -> {
                req.setIpv6VipAddress(v);
            }));
        builder.<List<String>>withRequestField("ipv6_vip_virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipVirsubnetId, (req, v) -> {
                req.setIpv6VipVirsubnetId(v);
            }));
        builder.<List<String>>withRequestField("eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getEips, (req, v) -> {
                req.setEips(v);
            }));
        builder.<List<String>>withRequestField("publicips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getPublicips, (req, v) -> {
                req.setPublicips(v);
            }));
        builder.<List<String>>withRequestField("availability_zone_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getAvailabilityZoneList, (req, v) -> {
                req.setAvailabilityZoneList(v);
            }));
        builder.<List<String>>withRequestField("l4_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL4FlavorId, (req, v) -> {
                req.setL4FlavorId(v);
            }));
        builder.<List<String>>withRequestField("l4_scale_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL4ScaleFlavorId, (req, v) -> {
                req.setL4ScaleFlavorId(v);
            }));
        builder.<List<String>>withRequestField("l7_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL7FlavorId, (req, v) -> {
                req.setL7FlavorId(v);
            }));
        builder.<List<String>>withRequestField("l7_scale_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL7ScaleFlavorId, (req, v) -> {
                req.setL7ScaleFlavorId(v);
            }));
        builder.<List<String>>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getBillingInfo, (req, v) -> {
                req.setBillingInfo(v);
            }));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            }));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<Integer>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<Boolean>withRequestField("deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getDeletionProtectionEnable, (req, v) -> {
                req.setDeletionProtectionEnable(v);
            }));
        builder.<List<String>>withRequestField("elb_virsubnet_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getElbVirsubnetType, (req, v) -> {
                req.setElbVirsubnetType(v);
            }));
        builder.<List<String>>withRequestField("autoscaling",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getAutoscaling, (req, v) -> {
                req.setAutoscaling(v);
            }));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getProtectionStatus, (req, v) -> {
                req.setProtectionStatus(v);
            }));
        builder.<List<String>>withRequestField("global_eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getGlobalEips, (req, v) -> {
                req.setGlobalEips(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogtanksRequest, ListLogtanksResponse> listLogtanks = genForlistLogtanks();

    private static HttpRequestDef<ListLogtanksRequest, ListLogtanksResponse> genForlistLogtanks() {
        // basic
        HttpRequestDef.Builder<ListLogtanksRequest, ListLogtanksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogtanksRequest.class, ListLogtanksResponse.class)
                .withName("ListLogtanks")
                .withUri("/v3/{project_id}/elb/logtanks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogtanksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLogtanksRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<List<String>>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<List<String>>withRequestField("log_topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLogTopicId, (req, v) -> {
                req.setLogTopicId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForlistMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForlistMembers() {
        // basic
        HttpRequestDef.Builder<ListMembersRequest, ListMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMembersRequest.class, ListMembersResponse.class)
                .withName("ListMembers")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<Integer>>withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getWeight, (req, v) -> {
                req.setWeight(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getSubnetCidrId, (req, v) -> {
                req.setSubnetCidrId(v);
            }));
        builder.<List<String>>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<List<Integer>>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<List<String>>withRequestField("member_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getMemberType, (req, v) -> {
                req.setMemberType(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForlistPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForlistPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withName("ListPools")
                .withUri("/v3/{project_id}/elb/pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<List<String>>withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getLbAlgorithm, (req, v) -> {
                req.setLbAlgorithm(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            }));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            }));
        builder.<Boolean>withRequestField("member_deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeletionProtectionEnable, (req, v) -> {
                req.setMemberDeletionProtectionEnable(v);
            }));
        builder.<List<String>>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<List<String>>withRequestField("member_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberInstanceId, (req, v) -> {
                req.setMemberInstanceId(v);
            }));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getProtectionStatus, (req, v) -> {
                req.setProtectionStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetails =
        genForlistQuotaDetails();

    private static HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> genForlistQuotaDetails() {
        // basic
        HttpRequestDef.Builder<ListQuotaDetailsRequest, ListQuotaDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaDetailsRequest.class, ListQuotaDetailsResponse.class)
                .withName("ListQuotaDetails")
                .withUri("/v3/{project_id}/elb/quotas/details")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("quota_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQuotaDetailsRequest::getQuotaKey, (req, v) -> {
                req.setQuotaKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPolicies =
        genForlistSecurityPolicies();

    private static HttpRequestDef<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> genForlistSecurityPolicies() {
        // basic
        HttpRequestDef.Builder<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSecurityPoliciesRequest.class, ListSecurityPoliciesResponse.class)
            .withName("ListSecurityPolicies")
            .withUri("/v3/{project_id}/elb/security-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("protocols",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getProtocols, (req, v) -> {
                req.setProtocols(v);
            }));
        builder.<List<String>>withRequestField("ciphers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getCiphers, (req, v) -> {
                req.setCiphers(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies =
        genForlistSystemSecurityPolicies();

    private static HttpRequestDef<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> genForlistSystemSecurityPolicies() {
        // basic
        HttpRequestDef.Builder<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSystemSecurityPoliciesRequest.class,
                    ListSystemSecurityPoliciesResponse.class)
                .withName("ListSystemSecurityPolicies")
                .withUri("/v3/{project_id}/elb/system-security-policies")
                .withContentType("application/json");

        // requests

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
                .withUri("/v3/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlavorRequest, ShowFlavorResponse> showFlavor = genForshowFlavor();

    private static HttpRequestDef<ShowFlavorRequest, ShowFlavorResponse> genForshowFlavor() {
        // basic
        HttpRequestDef.Builder<ShowFlavorRequest, ShowFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlavorRequest.class, ShowFlavorResponse.class)
                .withName("ShowFlavor")
                .withUri("/v3/{project_id}/elb/flavors/{flavor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlavorRequest::getFlavorId, (req, v) -> {
                req.setFlavorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitor =
        genForshowHealthMonitor();

    private static HttpRequestDef<ShowHealthMonitorRequest, ShowHealthMonitorResponse> genForshowHealthMonitor() {
        // basic
        HttpRequestDef.Builder<ShowHealthMonitorRequest, ShowHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHealthMonitorRequest.class, ShowHealthMonitorResponse.class)
                .withName("ShowHealthMonitor")
                .withUri("/v3/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthMonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7Policy = genForshowL7Policy();

    private static HttpRequestDef<ShowL7PolicyRequest, ShowL7PolicyResponse> genForshowL7Policy() {
        // basic
        HttpRequestDef.Builder<ShowL7PolicyRequest, ShowL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7PolicyRequest.class, ShowL7PolicyResponse.class)
                .withName("ShowL7Policy")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7PolicyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7RuleRequest, ShowL7RuleResponse> showL7Rule = genForshowL7Rule();

    private static HttpRequestDef<ShowL7RuleRequest, ShowL7RuleResponse> genForshowL7Rule() {
        // basic
        HttpRequestDef.Builder<ShowL7RuleRequest, ShowL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7RuleRequest.class, ShowL7RuleResponse.class)
                .withName("ShowL7Rule")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7RuleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForshowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForshowListener() {
        // basic
        HttpRequestDef.Builder<ShowListenerRequest, ShowListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListenerRequest.class, ShowListenerResponse.class)
                .withName("ShowListener")
                .withUri("/v3/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancer =
        genForshowLoadBalancer();

    private static HttpRequestDef<ShowLoadBalancerRequest, ShowLoadBalancerResponse> genForshowLoadBalancer() {
        // basic
        HttpRequestDef.Builder<ShowLoadBalancerRequest, ShowLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoadBalancerRequest.class, ShowLoadBalancerResponse.class)
                .withName("ShowLoadBalancer")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoadBalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatus =
        genForshowLoadBalancerStatus();

    private static HttpRequestDef<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> genForshowLoadBalancerStatus() {
        // basic
        HttpRequestDef.Builder<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLoadBalancerStatusRequest.class, ShowLoadBalancerStatusResponse.class)
            .withName("ShowLoadBalancerStatus")
            .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/statuses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoadBalancerStatusRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogtankRequest, ShowLogtankResponse> showLogtank = genForshowLogtank();

    private static HttpRequestDef<ShowLogtankRequest, ShowLogtankResponse> genForshowLogtank() {
        // basic
        HttpRequestDef.Builder<ShowLogtankRequest, ShowLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogtankRequest.class, ShowLogtankResponse.class)
                .withName("ShowLogtank")
                .withUri("/v3/{project_id}/elb/logtanks/{logtank_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogtankRequest::getLogtankId, (req, v) -> {
                req.setLogtankId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberRequest, ShowMemberResponse> showMember = genForshowMember();

    private static HttpRequestDef<ShowMemberRequest, ShowMemberResponse> genForshowMember() {
        // basic
        HttpRequestDef.Builder<ShowMemberRequest, ShowMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMemberRequest.class, ShowMemberResponse.class)
                .withName("ShowMember")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForshowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForshowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withName("ShowPool")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v3/{project_id}/elb/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicy =
        genForshowSecurityPolicy();

    private static HttpRequestDef<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> genForshowSecurityPolicy() {
        // basic
        HttpRequestDef.Builder<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecurityPolicyRequest.class, ShowSecurityPolicyResponse.class)
                .withName("ShowSecurityPolicy")
                .withUri("/v3/{project_id}/elb/security-policies/{security_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityPolicyRequest::getSecurityPolicyId, (req, v) -> {
                req.setSecurityPolicyId(v);
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
                .withUri("/v3/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitor =
        genForupdateHealthMonitor();

    private static HttpRequestDef<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> genForupdateHealthMonitor() {
        // basic
        HttpRequestDef.Builder<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthMonitorRequest.class, UpdateHealthMonitorResponse.class)
                .withName("UpdateHealthMonitor")
                .withUri("/v3/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthMonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));
        builder.<UpdateHealthMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthMonitorRequestBody.class),
            f -> f.withMarshaller(UpdateHealthMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7Policy =
        genForupdateL7Policy();

    private static HttpRequestDef<UpdateL7PolicyRequest, UpdateL7PolicyResponse> genForupdateL7Policy() {
        // basic
        HttpRequestDef.Builder<UpdateL7PolicyRequest, UpdateL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7PolicyRequest.class, UpdateL7PolicyResponse.class)
                .withName("UpdateL7Policy")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7PolicyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<UpdateL7PolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7PolicyRequestBody.class),
            f -> f.withMarshaller(UpdateL7PolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7Rule = genForupdateL7Rule();

    private static HttpRequestDef<UpdateL7RuleRequest, UpdateL7RuleResponse> genForupdateL7Rule() {
        // basic
        HttpRequestDef.Builder<UpdateL7RuleRequest, UpdateL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7RuleRequest.class, UpdateL7RuleResponse.class)
                .withName("UpdateL7Rule")
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7RuleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            }));
        builder.<UpdateL7RuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7RuleRequestBody.class),
            f -> f.withMarshaller(UpdateL7RuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener =
        genForupdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForupdateListener() {
        // basic
        HttpRequestDef.Builder<UpdateListenerRequest, UpdateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateListenerRequest.class, UpdateListenerResponse.class)
                .withName("UpdateListener")
                .withUri("/v3/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<UpdateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateListenerRequestBody.class),
            f -> f.withMarshaller(UpdateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancer =
        genForupdateLoadBalancer();

    private static HttpRequestDef<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> genForupdateLoadBalancer() {
        // basic
        HttpRequestDef.Builder<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoadBalancerRequest.class, UpdateLoadBalancerResponse.class)
                .withName("UpdateLoadBalancer")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLoadBalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<UpdateLoadBalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoadBalancerRequestBody.class),
            f -> f.withMarshaller(UpdateLoadBalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtank =
        genForupdateLogtank();

    private static HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> genForupdateLogtank() {
        // basic
        HttpRequestDef.Builder<UpdateLogtankRequest, UpdateLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLogtankRequest.class, UpdateLogtankResponse.class)
                .withName("UpdateLogtank")
                .withUri("/v3/{project_id}/elb/logtanks/{logtank_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getLogtankId, (req, v) -> {
                req.setLogtankId(v);
            }));
        builder.<UpdateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogtankRequestBody.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForupdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForupdateMember() {
        // basic
        HttpRequestDef.Builder<UpdateMemberRequest, UpdateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberRequest.class, UpdateMemberResponse.class)
                .withName("UpdateMember")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<UpdateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberRequestBody.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForupdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForupdatePool() {
        // basic
        HttpRequestDef.Builder<UpdatePoolRequest, UpdatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePoolRequest.class, UpdatePoolResponse.class)
                .withName("UpdatePool")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<UpdatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePoolRequestBody.class),
            f -> f.withMarshaller(UpdatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicy =
        genForupdateSecurityPolicy();

    private static HttpRequestDef<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> genForupdateSecurityPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSecurityPolicyRequest.class, UpdateSecurityPolicyResponse.class)
            .withName("UpdateSecurityPolicy")
            .withUri("/v3/{project_id}/elb/security-policies/{security_policy_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("security_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityPolicyRequest::getSecurityPolicyId, (req, v) -> {
                req.setSecurityPolicyId(v);
            }));
        builder.<UpdateSecurityPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/versions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIpListRequest, BatchDeleteIpListResponse> batchDeleteIpList =
        genForbatchDeleteIpList();

    private static HttpRequestDef<BatchDeleteIpListRequest, BatchDeleteIpListResponse> genForbatchDeleteIpList() {
        // basic
        HttpRequestDef.Builder<BatchDeleteIpListRequest, BatchDeleteIpListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteIpListRequest.class, BatchDeleteIpListResponse.class)
                .withName("BatchDeleteIpList")
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}/iplist/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteIpListRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
            }));
        builder.<BatchDeleteIpListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteIpListRequestBody.class),
            f -> f.withMarshaller(BatchDeleteIpListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNum =
        genForcountPreoccupyIpNum();

    private static HttpRequestDef<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> genForcountPreoccupyIpNum() {
        // basic
        HttpRequestDef.Builder<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountPreoccupyIpNumRequest.class, CountPreoccupyIpNumResponse.class)
                .withName("CountPreoccupyIpNum")
                .withUri("/v3/{project_id}/elb/preoccupy-ip-num")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getL7FlavorId, (req, v) -> {
                req.setL7FlavorId(v);
            }));
        builder.<Boolean>withRequestField("ip_target_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getIpTargetEnable, (req, v) -> {
                req.setIpTargetEnable(v);
            }));
        builder.<Integer>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<List<String>>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getAvailabilityZoneId, (req, v) -> {
                req.setAvailabilityZoneId(v);
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
                .withUri("/v3/{project_id}/elb/ipgroups")
                .withContentType("application/json;charset=UTF-8");

        // requests
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

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genFordeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genFordeleteIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteIpGroupRequest, DeleteIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpGroupRequest.class, DeleteIpGroupResponse.class)
                .withName("DeleteIpGroup")
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroups = genForlistIpGroups();

    private static HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> genForlistIpGroups() {
        // basic
        HttpRequestDef.Builder<ListIpGroupsRequest, ListIpGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpGroupsRequest.class, ListIpGroupsResponse.class)
                .withName("ListIpGroups")
                .withUri("/v3/{project_id}/elb/ipgroups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("ip_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getIpList, (req, v) -> {
                req.setIpList(v);
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
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
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
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
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

    public static final HttpRequestDef<UpdateIpListRequest, UpdateIpListResponse> updateIpList = genForupdateIpList();

    private static HttpRequestDef<UpdateIpListRequest, UpdateIpListResponse> genForupdateIpList() {
        // basic
        HttpRequestDef.Builder<UpdateIpListRequest, UpdateIpListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateIpListRequest.class, UpdateIpListResponse.class)
                .withName("UpdateIpList")
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}/iplist/create-or-update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpListRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
            }));
        builder.<UpdateIpListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateIpListRequestBody.class),
            f -> f.withMarshaller(UpdateIpListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
