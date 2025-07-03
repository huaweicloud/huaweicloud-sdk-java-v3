package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateLoadBalancersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateLoadBalancersRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateLoadBalancersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityRequestBody;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityResponse;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeRequest;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeRequestBody;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeResponse;
import com.huaweicloud.sdk.elb.v3.model.CloneLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.CloneLoadbalancerRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CloneLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.CountPreoccupyIpNumRequest;
import com.huaweicloud.sdk.elb.v3.model.CountPreoccupyIpNumResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificatePrivateKeyEchoRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificatePrivateKeyEchoRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificatePrivateKeyEchoResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberHealthCheckJobRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberHealthCheckJobRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberHealthCheckJobResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateSecurityPolicyRequestBody;
import com.huaweicloud.sdk.elb.v3.model.CreateSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerForceRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerForceResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerCascadeRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerCascadeRequestBody;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerCascadeResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerForceRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerForceResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.DeletePoolCascadeRequest;
import com.huaweicloud.sdk.elb.v3.model.DeletePoolCascadeResponse;
import com.huaweicloud.sdk.elb.v3.model.DeletePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.DeletePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteRecycleLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteRecycleLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.ListAllMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListAllMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListCertificatesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListCertificatesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListFeatureConfigsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListFeatureConfigsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListHealthMonitorsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListHealthMonitorsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListIpGroupsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListIpGroupsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListL7PoliciesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListL7PoliciesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListL7RulesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListL7RulesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListListenersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListListenersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListLoadBalancersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListLoadBalancersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListLoadbalancerFeatureRequest;
import com.huaweicloud.sdk.elb.v3.model.ListLoadbalancerFeatureResponse;
import com.huaweicloud.sdk.elb.v3.model.ListLogtanksRequest;
import com.huaweicloud.sdk.elb.v3.model.ListLogtanksResponse;
import com.huaweicloud.sdk.elb.v3.model.ListMasterSlavePoolsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListMasterSlavePoolsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListPoolsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListPoolsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListQuotaDetailsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListQuotaDetailsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListRecycleBinLoadBalancersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListRecycleBinLoadBalancersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListSecurityPoliciesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListSecurityPoliciesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListSystemSecurityPoliciesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListSystemSecurityPoliciesResponse;
import com.huaweicloud.sdk.elb.v3.model.RestoreLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.RestoreLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowCertificatePrivateKeyEchoRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowCertificatePrivateKeyEchoResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowFlavorRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowFlavorResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowIpGroupRelatedListenersRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowIpGroupRelatedListenersResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowJobRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowJobResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerPortsRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerPortsResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerStatusRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerStatusResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowMemberHealthCheckJobRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowMemberHealthCheckJobResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowPoolRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowPoolResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowQuotaRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowQuotaResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowRecycleBinRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowRecycleBinResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateCertificateRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinEnableRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinEnableRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinEnableResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinPolicyRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyRequestBody;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpgradeLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpgradeLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpgradeV3RequestBody;

import java.util.List;

@SuppressWarnings("unchecked")
public class ElbMeta {

    public static final HttpRequestDef<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse> batchAddAvailableZones =
        genForBatchAddAvailableZones();

    private static HttpRequestDef<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse> genForBatchAddAvailableZones() {
        // basic
        HttpRequestDef.Builder<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddAvailableZonesRequest.class, BatchAddAvailableZonesResponse.class)
            .withName("BatchAddAvailableZones")
            .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/availability-zone/batch-add")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAvailableZonesRequest::getLoadbalancerId,
                BatchAddAvailableZonesRequest::setLoadbalancerId));
        builder.<BatchAddAvailableZonesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddAvailableZonesRequestBody.class),
            f -> f.withMarshaller(BatchAddAvailableZonesRequest::getBody, BatchAddAvailableZonesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateLoadBalancersRequest, BatchCreateLoadBalancersResponse> batchCreateLoadBalancers =
        genForBatchCreateLoadBalancers();

    private static HttpRequestDef<BatchCreateLoadBalancersRequest, BatchCreateLoadBalancersResponse> genForBatchCreateLoadBalancers() {
        // basic
        HttpRequestDef.Builder<BatchCreateLoadBalancersRequest, BatchCreateLoadBalancersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchCreateLoadBalancersRequest.class, BatchCreateLoadBalancersResponse.class)
                .withName("BatchCreateLoadBalancers")
                .withUri("/v3/{project_id}/elb/loadbalancers/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreateLoadBalancersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateLoadBalancersRequestBody.class),
            f -> f.withMarshaller(BatchCreateLoadBalancersRequest::getBody, BatchCreateLoadBalancersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembers =
        genForBatchCreateMembers();

    private static HttpRequestDef<BatchCreateMembersRequest, BatchCreateMembersResponse> genForBatchCreateMembers() {
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
            f -> f.withMarshaller(BatchCreateMembersRequest::getPoolId, BatchCreateMembersRequest::setPoolId));
        builder.<BatchCreateMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateMembersRequestBody.class),
            f -> f.withMarshaller(BatchCreateMembersRequest::getBody, BatchCreateMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembers =
        genForBatchDeleteMembers();

    private static HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> genForBatchDeleteMembers() {
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
            f -> f.withMarshaller(BatchDeleteMembersRequest::getPoolId, BatchDeleteMembersRequest::setPoolId));
        builder.<BatchDeleteMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMembersRequestBody.class),
            f -> f.withMarshaller(BatchDeleteMembersRequest::getBody, BatchDeleteMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse> batchRemoveAvailableZones =
        genForBatchRemoveAvailableZones();

    private static HttpRequestDef<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse> genForBatchRemoveAvailableZones() {
        // basic
        HttpRequestDef.Builder<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRemoveAvailableZonesRequest.class,
                    BatchRemoveAvailableZonesResponse.class)
                .withName("BatchRemoveAvailableZones")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/availability-zone/batch-remove")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveAvailableZonesRequest::getLoadbalancerId,
                BatchRemoveAvailableZonesRequest::setLoadbalancerId));
        builder.<BatchRemoveAvailableZonesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemoveAvailableZonesRequestBody.class),
            f -> f.withMarshaller(BatchRemoveAvailableZonesRequest::getBody,
                BatchRemoveAvailableZonesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembers =
        genForBatchUpdateMembers();

    private static HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> genForBatchUpdateMembers() {
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
            f -> f.withMarshaller(BatchUpdateMembersRequest::getPoolId, BatchUpdateMembersRequest::setPoolId));
        builder.<BatchUpdateMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateMembersRequestBody.class),
            f -> f.withMarshaller(BatchUpdateMembersRequest::getBody, BatchUpdateMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriority =
        genForBatchUpdatePoliciesPriority();

    private static HttpRequestDef<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> genForBatchUpdatePoliciesPriority() {
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
            f -> f.withMarshaller(BatchUpdatePoliciesPriorityRequest::getBody,
                BatchUpdatePoliciesPriorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeMode =
        genForChangeLoadbalancerChargeMode();

    private static HttpRequestDef<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> genForChangeLoadbalancerChargeMode() {
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
            f -> f.withMarshaller(ChangeLoadbalancerChargeModeRequest::getBody,
                ChangeLoadbalancerChargeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloneLoadbalancerRequest, CloneLoadbalancerResponse> cloneLoadbalancer =
        genForCloneLoadbalancer();

    private static HttpRequestDef<CloneLoadbalancerRequest, CloneLoadbalancerResponse> genForCloneLoadbalancer() {
        // basic
        HttpRequestDef.Builder<CloneLoadbalancerRequest, CloneLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CloneLoadbalancerRequest.class, CloneLoadbalancerResponse.class)
                .withName("CloneLoadbalancer")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/clone")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloneLoadbalancerRequest::getLoadbalancerId,
                CloneLoadbalancerRequest::setLoadbalancerId));
        builder.<CloneLoadbalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloneLoadbalancerRequestBody.class),
            f -> f.withMarshaller(CloneLoadbalancerRequest::getBody, CloneLoadbalancerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForCreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForCreateCertificate() {
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
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificatePrivateKeyEchoRequest, CreateCertificatePrivateKeyEchoResponse> createCertificatePrivateKeyEcho =
        genForCreateCertificatePrivateKeyEcho();

    private static HttpRequestDef<CreateCertificatePrivateKeyEchoRequest, CreateCertificatePrivateKeyEchoResponse> genForCreateCertificatePrivateKeyEcho() {
        // basic
        HttpRequestDef.Builder<CreateCertificatePrivateKeyEchoRequest, CreateCertificatePrivateKeyEchoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCertificatePrivateKeyEchoRequest.class,
                    CreateCertificatePrivateKeyEchoResponse.class)
                .withName("CreateCertificatePrivateKeyEcho")
                .withUri("/v3/{project_id}/elb/certificates/settings/private-key-echo")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateCertificatePrivateKeyEchoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificatePrivateKeyEchoRequestBody.class),
            f -> f.withMarshaller(CreateCertificatePrivateKeyEchoRequest::getBody,
                CreateCertificatePrivateKeyEchoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitor =
        genForCreateHealthMonitor();

    private static HttpRequestDef<CreateHealthMonitorRequest, CreateHealthMonitorResponse> genForCreateHealthMonitor() {
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
            f -> f.withMarshaller(CreateHealthMonitorRequest::getBody, CreateHealthMonitorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7Policy =
        genForCreateL7Policy();

    private static HttpRequestDef<CreateL7PolicyRequest, CreateL7PolicyResponse> genForCreateL7Policy() {
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
            f -> f.withMarshaller(CreateL7PolicyRequest::getBody, CreateL7PolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7RuleRequest, CreateL7RuleResponse> createL7Rule = genForCreateL7Rule();

    private static HttpRequestDef<CreateL7RuleRequest, CreateL7RuleResponse> genForCreateL7Rule() {
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
            f -> f.withMarshaller(CreateL7RuleRequest::getL7policyId, CreateL7RuleRequest::setL7policyId));
        builder.<CreateL7RuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateL7RuleRequestBody.class),
            f -> f.withMarshaller(CreateL7RuleRequest::getBody, CreateL7RuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener =
        genForCreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForCreateListener() {
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
            f -> f.withMarshaller(CreateListenerRequest::getBody, CreateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancer =
        genForCreateLoadBalancer();

    private static HttpRequestDef<CreateLoadBalancerRequest, CreateLoadBalancerResponse> genForCreateLoadBalancer() {
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
            f -> f.withMarshaller(CreateLoadBalancerRequest::getBody, CreateLoadBalancerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> createLogtank =
        genForCreateLogtank();

    private static HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> genForCreateLogtank() {
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
            f -> f.withMarshaller(CreateLogtankRequest::getBody, CreateLogtankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse> createMasterSlavePool =
        genForCreateMasterSlavePool();

    private static HttpRequestDef<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse> genForCreateMasterSlavePool() {
        // basic
        HttpRequestDef.Builder<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMasterSlavePoolRequest.class, CreateMasterSlavePoolResponse.class)
            .withName("CreateMasterSlavePool")
            .withUri("/v3/{project_id}/elb/master-slave-pools")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateMasterSlavePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMasterSlavePoolRequestBody.class),
            f -> f.withMarshaller(CreateMasterSlavePoolRequest::getBody, CreateMasterSlavePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberRequest, CreateMemberResponse> createMember = genForCreateMember();

    private static HttpRequestDef<CreateMemberRequest, CreateMemberResponse> genForCreateMember() {
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
            f -> f.withMarshaller(CreateMemberRequest::getPoolId, CreateMemberRequest::setPoolId));
        builder.<CreateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMemberRequestBody.class),
            f -> f.withMarshaller(CreateMemberRequest::getBody, CreateMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberHealthCheckJobRequest, CreateMemberHealthCheckJobResponse> createMemberHealthCheckJob =
        genForCreateMemberHealthCheckJob();

    private static HttpRequestDef<CreateMemberHealthCheckJobRequest, CreateMemberHealthCheckJobResponse> genForCreateMemberHealthCheckJob() {
        // basic
        HttpRequestDef.Builder<CreateMemberHealthCheckJobRequest, CreateMemberHealthCheckJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMemberHealthCheckJobRequest.class,
                    CreateMemberHealthCheckJobResponse.class)
                .withName("CreateMemberHealthCheckJob")
                .withUri("/v3/{project_id}/elb/members/{member_id}/health-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberHealthCheckJobRequest::getMemberId,
                CreateMemberHealthCheckJobRequest::setMemberId));
        builder.<CreateMemberHealthCheckJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMemberHealthCheckJobRequestBody.class),
            f -> f.withMarshaller(CreateMemberHealthCheckJobRequest::getBody,
                CreateMemberHealthCheckJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForCreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForCreatePool() {
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
            f -> f.withMarshaller(CreatePoolRequest::getBody, CreatePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicy =
        genForCreateSecurityPolicy();

    private static HttpRequestDef<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> genForCreateSecurityPolicy() {
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
            f -> f.withMarshaller(CreateSecurityPolicyRequest::getBody, CreateSecurityPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
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
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitor =
        genForDeleteHealthMonitor();

    private static HttpRequestDef<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> genForDeleteHealthMonitor() {
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
            f -> f.withMarshaller(DeleteHealthMonitorRequest::getHealthmonitorId,
                DeleteHealthMonitorRequest::setHealthmonitorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7Policy =
        genForDeleteL7Policy();

    private static HttpRequestDef<DeleteL7PolicyRequest, DeleteL7PolicyResponse> genForDeleteL7Policy() {
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
            f -> f.withMarshaller(DeleteL7PolicyRequest::getL7policyId, DeleteL7PolicyRequest::setL7policyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7Rule = genForDeleteL7Rule();

    private static HttpRequestDef<DeleteL7RuleRequest, DeleteL7RuleResponse> genForDeleteL7Rule() {
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
            f -> f.withMarshaller(DeleteL7RuleRequest::getL7policyId, DeleteL7RuleRequest::setL7policyId));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7RuleRequest::getL7ruleId, DeleteL7RuleRequest::setL7ruleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener =
        genForDeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genForDeleteListener() {
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
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, DeleteListenerRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerForceRequest, DeleteListenerForceResponse> deleteListenerForce =
        genForDeleteListenerForce();

    private static HttpRequestDef<DeleteListenerForceRequest, DeleteListenerForceResponse> genForDeleteListenerForce() {
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
            f -> f.withMarshaller(DeleteListenerForceRequest::getListenerId,
                DeleteListenerForceRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancer =
        genForDeleteLoadBalancer();

    private static HttpRequestDef<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> genForDeleteLoadBalancer() {
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
            f -> f.withMarshaller(DeleteLoadBalancerRequest::getLoadbalancerId,
                DeleteLoadBalancerRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadBalancerCascadeRequest, DeleteLoadBalancerCascadeResponse> deleteLoadBalancerCascade =
        genForDeleteLoadBalancerCascade();

    private static HttpRequestDef<DeleteLoadBalancerCascadeRequest, DeleteLoadBalancerCascadeResponse> genForDeleteLoadBalancerCascade() {
        // basic
        HttpRequestDef.Builder<DeleteLoadBalancerCascadeRequest, DeleteLoadBalancerCascadeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteLoadBalancerCascadeRequest.class,
                    DeleteLoadBalancerCascadeResponse.class)
                .withName("DeleteLoadBalancerCascade")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/delete-cascade")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadBalancerCascadeRequest::getLoadbalancerId,
                DeleteLoadBalancerCascadeRequest::setLoadbalancerId));
        builder.<DeleteLoadBalancerCascadeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLoadBalancerCascadeRequestBody.class),
            f -> f.withMarshaller(DeleteLoadBalancerCascadeRequest::getBody,
                DeleteLoadBalancerCascadeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> deleteLoadBalancerForce =
        genForDeleteLoadBalancerForce();

    private static HttpRequestDef<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> genForDeleteLoadBalancerForce() {
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
            f -> f.withMarshaller(DeleteLoadBalancerForceRequest::getLoadbalancerId,
                DeleteLoadBalancerForceRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtank =
        genForDeleteLogtank();

    private static HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> genForDeleteLogtank() {
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
            f -> f.withMarshaller(DeleteLogtankRequest::getLogtankId, DeleteLogtankRequest::setLogtankId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse> deleteMasterSlavePool =
        genForDeleteMasterSlavePool();

    private static HttpRequestDef<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse> genForDeleteMasterSlavePool() {
        // basic
        HttpRequestDef.Builder<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMasterSlavePoolRequest.class, DeleteMasterSlavePoolResponse.class)
            .withName("DeleteMasterSlavePool")
            .withUri("/v3/{project_id}/elb/master-slave-pools/{pool_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMasterSlavePoolRequest::getPoolId, DeleteMasterSlavePoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genForDeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genForDeleteMember() {
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
            f -> f.withMarshaller(DeleteMemberRequest::getPoolId, DeleteMemberRequest::setPoolId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, DeleteMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genForDeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genForDeletePool() {
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
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, DeletePoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolCascadeRequest, DeletePoolCascadeResponse> deletePoolCascade =
        genForDeletePoolCascade();

    private static HttpRequestDef<DeletePoolCascadeRequest, DeletePoolCascadeResponse> genForDeletePoolCascade() {
        // basic
        HttpRequestDef.Builder<DeletePoolCascadeRequest, DeletePoolCascadeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolCascadeRequest.class, DeletePoolCascadeResponse.class)
                .withName("DeletePoolCascade")
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/delete-cascade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoolCascadeRequest::getPoolId, DeletePoolCascadeRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecycleLoadBalancerRequest, DeleteRecycleLoadBalancerResponse> deleteRecycleLoadBalancer =
        genForDeleteRecycleLoadBalancer();

    private static HttpRequestDef<DeleteRecycleLoadBalancerRequest, DeleteRecycleLoadBalancerResponse> genForDeleteRecycleLoadBalancer() {
        // basic
        HttpRequestDef.Builder<DeleteRecycleLoadBalancerRequest, DeleteRecycleLoadBalancerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRecycleLoadBalancerRequest.class,
                    DeleteRecycleLoadBalancerResponse.class)
                .withName("DeleteRecycleLoadBalancer")
                .withUri("/v3/{project_id}/elb/recycle-bin/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecycleLoadBalancerRequest::getLoadbalancerId,
                DeleteRecycleLoadBalancerRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicy =
        genForDeleteSecurityPolicy();

    private static HttpRequestDef<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> genForDeleteSecurityPolicy() {
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
            f -> f.withMarshaller(DeleteSecurityPolicyRequest::getSecurityPolicyId,
                DeleteSecurityPolicyRequest::setSecurityPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllMembersRequest, ListAllMembersResponse> listAllMembers =
        genForListAllMembers();

    private static HttpRequestDef<ListAllMembersRequest, ListAllMembersResponse> genForListAllMembers() {
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
            f -> f.withMarshaller(ListAllMembersRequest::getMarker, ListAllMembersRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllMembersRequest::getLimit, ListAllMembersRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllMembersRequest::getPageReverse, ListAllMembersRequest::setPageReverse));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getName, ListAllMembersRequest::setName));
        builder.<List<Integer>>withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getWeight, ListAllMembersRequest::setWeight));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllMembersRequest::getAdminStateUp, ListAllMembersRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getSubnetCidrId, ListAllMembersRequest::setSubnetCidrId));
        builder.<List<String>>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getAddress, ListAllMembersRequest::setAddress));
        builder.<List<Integer>>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getProtocolPort, ListAllMembersRequest::setProtocolPort));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getId, ListAllMembersRequest::setId));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getOperatingStatus,
                ListAllMembersRequest::setOperatingStatus));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getEnterpriseProjectId,
                ListAllMembersRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getIpVersion, ListAllMembersRequest::setIpVersion));
        builder.<List<String>>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getPoolId, ListAllMembersRequest::setPoolId));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllMembersRequest::getLoadbalancerId, ListAllMembersRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForListAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForListAvailabilityZones() {
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
            f -> f.withMarshaller(ListAvailabilityZonesRequest::getPublicBorderGroup,
                ListAvailabilityZonesRequest::setPublicBorderGroup));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailabilityZonesRequest::getLoadbalancerId,
                ListAvailabilityZonesRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
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
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, ListCertificatesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, ListCertificatesRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPageReverse, ListCertificatesRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getId, ListCertificatesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, ListCertificatesRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDescription, ListCertificatesRequest::setDescription));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getAdminStateUp, ListCertificatesRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDomain, ListCertificatesRequest::setDomain));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getType, ListCertificatesRequest::setType));
        builder.<List<String>>withRequestField("scm_certificate_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getScmCertificateId,
                ListCertificatesRequest::setScmCertificateId));
        builder.<List<String>>withRequestField("common_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getCommonName, ListCertificatesRequest::setCommonName));
        builder.<List<String>>withRequestField("fingerprint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getFingerprint, ListCertificatesRequest::setFingerprint));
        builder.<List<String>>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getSource, ListCertificatesRequest::setSource));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getProtectionStatus,
                ListCertificatesRequest::setProtectionStatus));
        builder.<List<String>>withRequestField("protection_reason",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getProtectionReason,
                ListCertificatesRequest::setProtectionReason));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId,
                ListCertificatesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeatureConfigsRequest, ListFeatureConfigsResponse> listFeatureConfigs =
        genForListFeatureConfigs();

    private static HttpRequestDef<ListFeatureConfigsRequest, ListFeatureConfigsResponse> genForListFeatureConfigs() {
        // basic
        HttpRequestDef.Builder<ListFeatureConfigsRequest, ListFeatureConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeatureConfigsRequest.class, ListFeatureConfigsResponse.class)
                .withName("ListFeatureConfigs")
                .withUri("/v3/{project_id}/elb/feature/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("feature",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeatureConfigsRequest::getFeature, ListFeatureConfigsRequest::setFeature));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
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
            f -> f.withMarshaller(ListFlavorsRequest::getMarker, ListFlavorsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, ListFlavorsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlavorsRequest::getPageReverse, ListFlavorsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getId, ListFlavorsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getName, ListFlavorsRequest::setName));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getType, ListFlavorsRequest::setType));
        builder.<Boolean>withRequestField("shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlavorsRequest::getShared, ListFlavorsRequest::setShared));
        builder.<List<String>>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getPublicBorderGroup, ListFlavorsRequest::setPublicBorderGroup));
        builder.<List<Integer>>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCategory, ListFlavorsRequest::setCategory));
        builder.<Boolean>withRequestField("list_all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlavorsRequest::getListAll, ListFlavorsRequest::setListAll));
        builder.<Boolean>withRequestField("flavor_sold_out",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlavorsRequest::getFlavorSoldOut, ListFlavorsRequest::setFlavorSoldOut));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitors =
        genForListHealthMonitors();

    private static HttpRequestDef<ListHealthMonitorsRequest, ListHealthMonitorsResponse> genForListHealthMonitors() {
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
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMarker, ListHealthMonitorsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getLimit, ListHealthMonitorsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getPageReverse,
                ListHealthMonitorsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getId, ListHealthMonitorsRequest::setId));
        builder.<List<Integer>>withRequestField("monitor_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMonitorPort,
                ListHealthMonitorsRequest::setMonitorPort));
        builder.<List<String>>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getDomainName, ListHealthMonitorsRequest::setDomainName));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getName, ListHealthMonitorsRequest::setName));
        builder.<List<Integer>>withRequestField("delay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getDelay, ListHealthMonitorsRequest::setDelay));
        builder.<List<Integer>>withRequestField("max_retries",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMaxRetries, ListHealthMonitorsRequest::setMaxRetries));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getAdminStateUp,
                ListHealthMonitorsRequest::setAdminStateUp));
        builder.<List<Integer>>withRequestField("max_retries_down",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMaxRetriesDown,
                ListHealthMonitorsRequest::setMaxRetriesDown));
        builder.<Integer>withRequestField("timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getTimeout, ListHealthMonitorsRequest::setTimeout));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getType, ListHealthMonitorsRequest::setType));
        builder.<List<String>>withRequestField("expected_codes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getExpectedCodes,
                ListHealthMonitorsRequest::setExpectedCodes));
        builder.<List<String>>withRequestField("url_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getUrlPath, ListHealthMonitorsRequest::setUrlPath));
        builder.<List<String>>withRequestField("http_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getHttpMethod, ListHealthMonitorsRequest::setHttpMethod));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHealthMonitorsRequest::getEnterpriseProjectId,
                ListHealthMonitorsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v3/{project_id}/elb/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getMarker, ListJobsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListJobsRequest::getPageReverse, ListJobsRequest::setPageReverse));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getJobId, ListJobsRequest::setJobId));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getJobType, ListJobsRequest::setJobType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, ListJobsRequest::setStatus));
        builder.<String>withRequestField("error_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getErrorCode, ListJobsRequest::setErrorCode));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getResourceId, ListJobsRequest::setResourceId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getBeginTime, ListJobsRequest::setBeginTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7Policies =
        genForListL7Policies();

    private static HttpRequestDef<ListL7PoliciesRequest, ListL7PoliciesResponse> genForListL7Policies() {
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
            f -> f.withMarshaller(ListL7PoliciesRequest::getMarker, ListL7PoliciesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getLimit, ListL7PoliciesRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getPageReverse, ListL7PoliciesRequest::setPageReverse));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getEnterpriseProjectId,
                ListL7PoliciesRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getId, ListL7PoliciesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getName, ListL7PoliciesRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getDescription, ListL7PoliciesRequest::setDescription));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getAdminStateUp, ListL7PoliciesRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getListenerId, ListL7PoliciesRequest::setListenerId));
        builder.<List<Integer>>withRequestField("position",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getPosition, ListL7PoliciesRequest::setPosition));
        builder.<List<String>>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getAction, ListL7PoliciesRequest::setAction));
        builder.<List<String>>withRequestField("redirect_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectUrl, ListL7PoliciesRequest::setRedirectUrl));
        builder.<List<String>>withRequestField("redirect_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectPoolId, ListL7PoliciesRequest::setRedirectPoolId));
        builder.<List<String>>withRequestField("redirect_listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectListenerId,
                ListL7PoliciesRequest::setRedirectListenerId));
        builder.<List<String>>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getProvisioningStatus,
                ListL7PoliciesRequest::setProvisioningStatus));
        builder.<Boolean>withRequestField("display_all_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getDisplayAllRules,
                ListL7PoliciesRequest::setDisplayAllRules));
        builder.<List<Integer>>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7PoliciesRequest::getPriority, ListL7PoliciesRequest::setPriority));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7RulesRequest, ListL7RulesResponse> listL7Rules = genForListL7Rules();

    private static HttpRequestDef<ListL7RulesRequest, ListL7RulesResponse> genForListL7Rules() {
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
            f -> f.withMarshaller(ListL7RulesRequest::getL7policyId, ListL7RulesRequest::setL7policyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7RulesRequest::getLimit, ListL7RulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7RulesRequest::getMarker, ListL7RulesRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7RulesRequest::getPageReverse, ListL7RulesRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getId, ListL7RulesRequest::setId));
        builder.<List<String>>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getCompareType, ListL7RulesRequest::setCompareType));
        builder.<List<String>>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getProvisioningStatus,
                ListL7RulesRequest::setProvisioningStatus));
        builder.<Boolean>withRequestField("invert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7RulesRequest::getInvert, ListL7RulesRequest::setInvert));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7RulesRequest::getAdminStateUp, ListL7RulesRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getValue, ListL7RulesRequest::setValue));
        builder.<List<String>>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getKey, ListL7RulesRequest::setKey));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getType, ListL7RulesRequest::setType));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListL7RulesRequest::getEnterpriseProjectId,
                ListL7RulesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners =
        genForListListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForListListeners() {
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
            f -> f.withMarshaller(ListListenersRequest::getLimit, ListListenersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getMarker, ListListenersRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, ListListenersRequest::setPageReverse));
        builder.<List<String>>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocolPort, ListListenersRequest::setProtocolPort));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocol, ListListenersRequest::setProtocol));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getDescription, ListListenersRequest::setDescription));
        builder.<List<String>>withRequestField("default_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultTlsContainerRef,
                ListListenersRequest::setDefaultTlsContainerRef));
        builder.<List<String>>withRequestField("client_ca_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getClientCaTlsContainerRef,
                ListListenersRequest::setClientCaTlsContainerRef));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getAdminStateUp, ListListenersRequest::setAdminStateUp));
        builder.<Boolean>withRequestField("include_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getIncludeRecycleBin,
                ListListenersRequest::setIncludeRecycleBin));
        builder.<List<Integer>>withRequestField("connection_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getConnectionLimit, ListListenersRequest::setConnectionLimit));
        builder.<List<String>>withRequestField("default_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultPoolId, ListListenersRequest::setDefaultPoolId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getId, ListListenersRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getName, ListListenersRequest::setName));
        builder.<Boolean>withRequestField("http2_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getHttp2Enable, ListListenersRequest::setHttp2Enable));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getLoadbalancerId, ListListenersRequest::setLoadbalancerId));
        builder.<List<String>>withRequestField("tls_ciphers_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getTlsCiphersPolicy,
                ListListenersRequest::setTlsCiphersPolicy));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberAddress, ListListenersRequest::setMemberAddress));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberDeviceId, ListListenersRequest::setMemberDeviceId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getEnterpriseProjectId,
                ListListenersRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("enable_member_retry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getEnableMemberRetry,
                ListListenersRequest::setEnableMemberRetry));
        builder.<List<Integer>>withRequestField("member_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberTimeout, ListListenersRequest::setMemberTimeout));
        builder.<List<Integer>>withRequestField("client_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getClientTimeout, ListListenersRequest::setClientTimeout));
        builder.<List<Integer>>withRequestField("keepalive_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getKeepaliveTimeout,
                ListListenersRequest::setKeepaliveTimeout));
        builder.<Boolean>withRequestField("transparent_client_ip_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getTransparentClientIpEnable,
                ListListenersRequest::setTransparentClientIpEnable));
        builder.<Boolean>withRequestField("proxy_protocol_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getProxyProtocolEnable,
                ListListenersRequest::setProxyProtocolEnable));
        builder.<Boolean>withRequestField("enhance_l7policy_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getEnhanceL7policyEnable,
                ListListenersRequest::setEnhanceL7policyEnable));
        builder.<List<String>>withRequestField("member_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getMemberInstanceId,
                ListListenersRequest::setMemberInstanceId));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListListenersRequest::getProtectionStatus,
                ListListenersRequest::setProtectionStatus));
        builder.<Boolean>withRequestField("ssl_early_data_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getSslEarlyDataEnable,
                ListListenersRequest::setSslEarlyDataEnable));
        builder.<Boolean>withRequestField("nat64_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getNat64Enable, ListListenersRequest::setNat64Enable));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancers =
        genForListLoadBalancers();

    private static HttpRequestDef<ListLoadBalancersRequest, ListLoadBalancersResponse> genForListLoadBalancers() {
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
            f -> f.withMarshaller(ListLoadBalancersRequest::getMarker, ListLoadBalancersRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getLimit, ListLoadBalancersRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getPageReverse, ListLoadBalancersRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getId, ListLoadBalancersRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getName, ListLoadBalancersRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getDescription, ListLoadBalancersRequest::setDescription));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getAdminStateUp,
                ListLoadBalancersRequest::setAdminStateUp));
        builder.<Boolean>withRequestField("include_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIncludeRecycleBin,
                ListLoadBalancersRequest::setIncludeRecycleBin));
        builder.<List<String>>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getProvisioningStatus,
                ListLoadBalancersRequest::setProvisioningStatus));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getOperatingStatus,
                ListLoadBalancersRequest::setOperatingStatus));
        builder.<Boolean>withRequestField("guaranteed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getGuaranteed, ListLoadBalancersRequest::setGuaranteed));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVpcId, ListLoadBalancersRequest::setVpcId));
        builder.<List<String>>withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipPortId, ListLoadBalancersRequest::setVipPortId));
        builder.<List<String>>withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipAddress, ListLoadBalancersRequest::setVipAddress));
        builder.<List<String>>withRequestField("vip_subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipSubnetCidrId,
                ListLoadBalancersRequest::setVipSubnetCidrId));
        builder.<List<String>>withRequestField("ipv6_vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipPortId,
                ListLoadBalancersRequest::setIpv6VipPortId));
        builder.<List<String>>withRequestField("ipv6_vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipAddress,
                ListLoadBalancersRequest::setIpv6VipAddress));
        builder.<List<String>>withRequestField("ipv6_vip_virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipVirsubnetId,
                ListLoadBalancersRequest::setIpv6VipVirsubnetId));
        builder.<List<String>>withRequestField("eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getEips, ListLoadBalancersRequest::setEips));
        builder.<List<String>>withRequestField("publicips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getPublicips, ListLoadBalancersRequest::setPublicips));
        builder.<List<String>>withRequestField("availability_zone_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getAvailabilityZoneList,
                ListLoadBalancersRequest::setAvailabilityZoneList));
        builder.<List<String>>withRequestField("l4_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL4FlavorId, ListLoadBalancersRequest::setL4FlavorId));
        builder.<List<String>>withRequestField("l4_scale_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL4ScaleFlavorId,
                ListLoadBalancersRequest::setL4ScaleFlavorId));
        builder.<List<String>>withRequestField("l7_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL7FlavorId, ListLoadBalancersRequest::setL7FlavorId));
        builder.<List<String>>withRequestField("l7_scale_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getL7ScaleFlavorId,
                ListLoadBalancersRequest::setL7ScaleFlavorId));
        builder.<List<String>>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getBillingInfo, ListLoadBalancersRequest::setBillingInfo));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getMemberDeviceId,
                ListLoadBalancersRequest::setMemberDeviceId));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getMemberAddress,
                ListLoadBalancersRequest::setMemberAddress));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getEnterpriseProjectId,
                ListLoadBalancersRequest::setEnterpriseProjectId));
        builder.<List<Integer>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpVersion, ListLoadBalancersRequest::setIpVersion));
        builder.<Boolean>withRequestField("deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getDeletionProtectionEnable,
                ListLoadBalancersRequest::setDeletionProtectionEnable));
        builder.<List<String>>withRequestField("elb_virsubnet_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getElbVirsubnetType,
                ListLoadBalancersRequest::setElbVirsubnetType));
        builder.<List<String>>withRequestField("autoscaling",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getAutoscaling, ListLoadBalancersRequest::setAutoscaling));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getProtectionStatus,
                ListLoadBalancersRequest::setProtectionStatus));
        builder.<List<String>>withRequestField("global_eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getGlobalEips, ListLoadBalancersRequest::setGlobalEips));
        builder.<String>withRequestField("log_topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getLogTopicId, ListLoadBalancersRequest::setLogTopicId));
        builder.<String>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadBalancersRequest::getLogGroupId, ListLoadBalancersRequest::setLogGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancerFeatureRequest, ListLoadbalancerFeatureResponse> listLoadbalancerFeature =
        genForListLoadbalancerFeature();

    private static HttpRequestDef<ListLoadbalancerFeatureRequest, ListLoadbalancerFeatureResponse> genForListLoadbalancerFeature() {
        // basic
        HttpRequestDef.Builder<ListLoadbalancerFeatureRequest, ListLoadbalancerFeatureResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLoadbalancerFeatureRequest.class, ListLoadbalancerFeatureResponse.class)
            .withName("ListLoadbalancerFeature")
            .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/features")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancerFeatureRequest::getLoadbalancerId,
                ListLoadbalancerFeatureRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogtanksRequest, ListLogtanksResponse> listLogtanks = genForListLogtanks();

    private static HttpRequestDef<ListLogtanksRequest, ListLogtanksResponse> genForListLogtanks() {
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
            f -> f.withMarshaller(ListLogtanksRequest::getLimit, ListLogtanksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogtanksRequest::getMarker, ListLogtanksRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLogtanksRequest::getPageReverse, ListLogtanksRequest::setPageReverse));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getEnterpriseProjectId,
                ListLogtanksRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getId, ListLogtanksRequest::setId));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLoadbalancerId, ListLogtanksRequest::setLoadbalancerId));
        builder.<List<String>>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLogGroupId, ListLogtanksRequest::setLogGroupId));
        builder.<List<String>>withRequestField("log_topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLogTopicId, ListLogtanksRequest::setLogTopicId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse> listMasterSlavePools =
        genForListMasterSlavePools();

    private static HttpRequestDef<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse> genForListMasterSlavePools() {
        // basic
        HttpRequestDef.Builder<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMasterSlavePoolsRequest.class, ListMasterSlavePoolsResponse.class)
            .withName("ListMasterSlavePools")
            .withUri("/v3/{project_id}/elb/master-slave-pools")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getMarker, ListMasterSlavePoolsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getLimit, ListMasterSlavePoolsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getPageReverse,
                ListMasterSlavePoolsRequest::setPageReverse));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getDescription,
                ListMasterSlavePoolsRequest::setDescription));
        builder.<List<String>>withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getHealthmonitorId,
                ListMasterSlavePoolsRequest::setHealthmonitorId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getId, ListMasterSlavePoolsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getName, ListMasterSlavePoolsRequest::setName));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getLoadbalancerId,
                ListMasterSlavePoolsRequest::setLoadbalancerId));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getProtocol, ListMasterSlavePoolsRequest::setProtocol));
        builder.<List<String>>withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getLbAlgorithm,
                ListMasterSlavePoolsRequest::setLbAlgorithm));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getEnterpriseProjectId,
                ListMasterSlavePoolsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getIpVersion,
                ListMasterSlavePoolsRequest::setIpVersion));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getMemberAddress,
                ListMasterSlavePoolsRequest::setMemberAddress));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getMemberDeviceId,
                ListMasterSlavePoolsRequest::setMemberDeviceId));
        builder.<List<String>>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getListenerId,
                ListMasterSlavePoolsRequest::setListenerId));
        builder.<List<String>>withRequestField("member_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getMemberInstanceId,
                ListMasterSlavePoolsRequest::setMemberInstanceId));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getVpcId, ListMasterSlavePoolsRequest::setVpcId));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getType, ListMasterSlavePoolsRequest::setType));
        builder.<Boolean>withRequestField("connection_drain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMasterSlavePoolsRequest::getConnectionDrain,
                ListMasterSlavePoolsRequest::setConnectionDrain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForListMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForListMembers() {
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
            f -> f.withMarshaller(ListMembersRequest::getPoolId, ListMembersRequest::setPoolId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getMarker, ListMembersRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getLimit, ListMembersRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getPageReverse, ListMembersRequest::setPageReverse));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getName, ListMembersRequest::setName));
        builder.<List<Integer>>withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getWeight, ListMembersRequest::setWeight));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getAdminStateUp, ListMembersRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getSubnetCidrId, ListMembersRequest::setSubnetCidrId));
        builder.<List<String>>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getAddress, ListMembersRequest::setAddress));
        builder.<List<Integer>>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getProtocolPort, ListMembersRequest::setProtocolPort));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getId, ListMembersRequest::setId));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getOperatingStatus, ListMembersRequest::setOperatingStatus));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getEnterpriseProjectId,
                ListMembersRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getIpVersion, ListMembersRequest::setIpVersion));
        builder.<List<String>>withRequestField("member_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getMemberType, ListMembersRequest::setMemberType));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getInstanceId, ListMembersRequest::setInstanceId));
        builder.<List<String>>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMembersRequest::getAvailabilityZone, ListMembersRequest::setAvailabilityZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForListPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForListPools() {
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
            f -> f.withMarshaller(ListPoolsRequest::getMarker, ListPoolsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getLimit, ListPoolsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getPageReverse, ListPoolsRequest::setPageReverse));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getDescription, ListPoolsRequest::setDescription));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getAdminStateUp, ListPoolsRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getHealthmonitorId, ListPoolsRequest::setHealthmonitorId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getId, ListPoolsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getName, ListPoolsRequest::setName));
        builder.<List<String>>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getLoadbalancerId, ListPoolsRequest::setLoadbalancerId));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getProtocol, ListPoolsRequest::setProtocol));
        builder.<List<String>>withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getLbAlgorithm, ListPoolsRequest::setLbAlgorithm));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getEnterpriseProjectId, ListPoolsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getIpVersion, ListPoolsRequest::setIpVersion));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberAddress, ListPoolsRequest::setMemberAddress));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeviceId, ListPoolsRequest::setMemberDeviceId));
        builder.<Boolean>withRequestField("member_deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeletionProtectionEnable,
                ListPoolsRequest::setMemberDeletionProtectionEnable));
        builder.<List<String>>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getListenerId, ListPoolsRequest::setListenerId));
        builder.<List<String>>withRequestField("member_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberInstanceId, ListPoolsRequest::setMemberInstanceId));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getVpcId, ListPoolsRequest::setVpcId));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getType, ListPoolsRequest::setType));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getProtectionStatus, ListPoolsRequest::setProtectionStatus));
        builder.<Boolean>withRequestField("connection_drain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getConnectionDrain, ListPoolsRequest::setConnectionDrain));
        builder.<String>withRequestField("pool_health",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getPoolHealth, ListPoolsRequest::setPoolHealth));
        builder.<Boolean>withRequestField("any_port_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getAnyPortEnable, ListPoolsRequest::setAnyPortEnable));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getPublicBorderGroup, ListPoolsRequest::setPublicBorderGroup));
        builder.<Integer>withRequestField("quic_cid_len",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getQuicCidLen, ListPoolsRequest::setQuicCidLen));
        builder.<Integer>withRequestField("quic_cid_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getQuicCidOffset, ListPoolsRequest::setQuicCidOffset));
        builder.<List<String>>withRequestField("az_affinity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolsRequest::getAzAffinity, ListPoolsRequest::setAzAffinity));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetails =
        genForListQuotaDetails();

    private static HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> genForListQuotaDetails() {
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
            f -> f.withMarshaller(ListQuotaDetailsRequest::getQuotaKey, ListQuotaDetailsRequest::setQuotaKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleBinLoadBalancersRequest, ListRecycleBinLoadBalancersResponse> listRecycleBinLoadBalancers =
        genForListRecycleBinLoadBalancers();

    private static HttpRequestDef<ListRecycleBinLoadBalancersRequest, ListRecycleBinLoadBalancersResponse> genForListRecycleBinLoadBalancers() {
        // basic
        HttpRequestDef.Builder<ListRecycleBinLoadBalancersRequest, ListRecycleBinLoadBalancersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRecycleBinLoadBalancersRequest.class,
                    ListRecycleBinLoadBalancersResponse.class)
                .withName("ListRecycleBinLoadBalancers")
                .withUri("/v3/{project_id}/elb/recycle-bin/loadbalancers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getMarker,
                ListRecycleBinLoadBalancersRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getLimit,
                ListRecycleBinLoadBalancersRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getPageReverse,
                ListRecycleBinLoadBalancersRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getId,
                ListRecycleBinLoadBalancersRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getName,
                ListRecycleBinLoadBalancersRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getDescription,
                ListRecycleBinLoadBalancersRequest::setDescription));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getAdminStateUp,
                ListRecycleBinLoadBalancersRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getOperatingStatus,
                ListRecycleBinLoadBalancersRequest::setOperatingStatus));
        builder.<Boolean>withRequestField("guaranteed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getGuaranteed,
                ListRecycleBinLoadBalancersRequest::setGuaranteed));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getVpcId,
                ListRecycleBinLoadBalancersRequest::setVpcId));
        builder.<List<String>>withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getVipPortId,
                ListRecycleBinLoadBalancersRequest::setVipPortId));
        builder.<List<String>>withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getVipAddress,
                ListRecycleBinLoadBalancersRequest::setVipAddress));
        builder.<List<String>>withRequestField("vip_subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getVipSubnetCidrId,
                ListRecycleBinLoadBalancersRequest::setVipSubnetCidrId));
        builder.<List<String>>withRequestField("ipv6_vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getIpv6VipPortId,
                ListRecycleBinLoadBalancersRequest::setIpv6VipPortId));
        builder.<List<String>>withRequestField("ipv6_vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getIpv6VipAddress,
                ListRecycleBinLoadBalancersRequest::setIpv6VipAddress));
        builder.<List<String>>withRequestField("ipv6_vip_virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getIpv6VipVirsubnetId,
                ListRecycleBinLoadBalancersRequest::setIpv6VipVirsubnetId));
        builder.<List<String>>withRequestField("eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getEips,
                ListRecycleBinLoadBalancersRequest::setEips));
        builder.<List<String>>withRequestField("publicips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getPublicips,
                ListRecycleBinLoadBalancersRequest::setPublicips));
        builder.<List<String>>withRequestField("availability_zone_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getAvailabilityZoneList,
                ListRecycleBinLoadBalancersRequest::setAvailabilityZoneList));
        builder.<List<String>>withRequestField("l4_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getL4FlavorId,
                ListRecycleBinLoadBalancersRequest::setL4FlavorId));
        builder.<List<String>>withRequestField("l7_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getL7FlavorId,
                ListRecycleBinLoadBalancersRequest::setL7FlavorId));
        builder.<List<String>>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getBillingInfo,
                ListRecycleBinLoadBalancersRequest::setBillingInfo));
        builder.<List<String>>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getMemberDeviceId,
                ListRecycleBinLoadBalancersRequest::setMemberDeviceId));
        builder.<List<String>>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getMemberAddress,
                ListRecycleBinLoadBalancersRequest::setMemberAddress));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getEnterpriseProjectId,
                ListRecycleBinLoadBalancersRequest::setEnterpriseProjectId));
        builder.<List<Integer>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getIpVersion,
                ListRecycleBinLoadBalancersRequest::setIpVersion));
        builder.<Boolean>withRequestField("deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getDeletionProtectionEnable,
                ListRecycleBinLoadBalancersRequest::setDeletionProtectionEnable));
        builder.<List<String>>withRequestField("elb_virsubnet_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getElbVirsubnetType,
                ListRecycleBinLoadBalancersRequest::setElbVirsubnetType));
        builder.<List<String>>withRequestField("autoscaling",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getAutoscaling,
                ListRecycleBinLoadBalancersRequest::setAutoscaling));
        builder.<List<String>>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getProtectionStatus,
                ListRecycleBinLoadBalancersRequest::setProtectionStatus));
        builder.<List<String>>withRequestField("global_eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getGlobalEips,
                ListRecycleBinLoadBalancersRequest::setGlobalEips));
        builder.<String>withRequestField("log_topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getLogTopicId,
                ListRecycleBinLoadBalancersRequest::setLogTopicId));
        builder.<String>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleBinLoadBalancersRequest::getLogGroupId,
                ListRecycleBinLoadBalancersRequest::setLogGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPolicies =
        genForListSecurityPolicies();

    private static HttpRequestDef<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> genForListSecurityPolicies() {
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
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getMarker, ListSecurityPoliciesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getLimit, ListSecurityPoliciesRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getPageReverse,
                ListSecurityPoliciesRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getId, ListSecurityPoliciesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getName, ListSecurityPoliciesRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getDescription,
                ListSecurityPoliciesRequest::setDescription));
        builder.<List<String>>withRequestField("protocols",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getProtocols,
                ListSecurityPoliciesRequest::setProtocols));
        builder.<List<String>>withRequestField("ciphers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityPoliciesRequest::getCiphers, ListSecurityPoliciesRequest::setCiphers));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies =
        genForListSystemSecurityPolicies();

    private static HttpRequestDef<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> genForListSystemSecurityPolicies() {
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

    public static final HttpRequestDef<RestoreLoadbalancerRequest, RestoreLoadbalancerResponse> restoreLoadbalancer =
        genForRestoreLoadbalancer();

    private static HttpRequestDef<RestoreLoadbalancerRequest, RestoreLoadbalancerResponse> genForRestoreLoadbalancer() {
        // basic
        HttpRequestDef.Builder<RestoreLoadbalancerRequest, RestoreLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RestoreLoadbalancerRequest.class, RestoreLoadbalancerResponse.class)
                .withName("RestoreLoadbalancer")
                .withUri("/v3/{project_id}/elb/recycle-bin/loadbalancers/{loadbalancer_id}/recover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreLoadbalancerRequest::getLoadbalancerId,
                RestoreLoadbalancerRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForShowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForShowCertificate() {
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
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, ShowCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificatePrivateKeyEchoRequest, ShowCertificatePrivateKeyEchoResponse> showCertificatePrivateKeyEcho =
        genForShowCertificatePrivateKeyEcho();

    private static HttpRequestDef<ShowCertificatePrivateKeyEchoRequest, ShowCertificatePrivateKeyEchoResponse> genForShowCertificatePrivateKeyEcho() {
        // basic
        HttpRequestDef.Builder<ShowCertificatePrivateKeyEchoRequest, ShowCertificatePrivateKeyEchoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificatePrivateKeyEchoRequest.class,
                    ShowCertificatePrivateKeyEchoResponse.class)
                .withName("ShowCertificatePrivateKeyEcho")
                .withUri("/v3/{project_id}/elb/certificates/settings/private-key-echo")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlavorRequest, ShowFlavorResponse> showFlavor = genForShowFlavor();

    private static HttpRequestDef<ShowFlavorRequest, ShowFlavorResponse> genForShowFlavor() {
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
            f -> f.withMarshaller(ShowFlavorRequest::getFlavorId, ShowFlavorRequest::setFlavorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitor =
        genForShowHealthMonitor();

    private static HttpRequestDef<ShowHealthMonitorRequest, ShowHealthMonitorResponse> genForShowHealthMonitor() {
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
            f -> f.withMarshaller(ShowHealthMonitorRequest::getHealthmonitorId,
                ShowHealthMonitorRequest::setHealthmonitorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v3/{project_id}/elb/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7Policy = genForShowL7Policy();

    private static HttpRequestDef<ShowL7PolicyRequest, ShowL7PolicyResponse> genForShowL7Policy() {
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
            f -> f.withMarshaller(ShowL7PolicyRequest::getL7policyId, ShowL7PolicyRequest::setL7policyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7RuleRequest, ShowL7RuleResponse> showL7Rule = genForShowL7Rule();

    private static HttpRequestDef<ShowL7RuleRequest, ShowL7RuleResponse> genForShowL7Rule() {
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
            f -> f.withMarshaller(ShowL7RuleRequest::getL7policyId, ShowL7RuleRequest::setL7policyId));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7RuleRequest::getL7ruleId, ShowL7RuleRequest::setL7ruleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForShowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForShowListener() {
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
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, ShowListenerRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancer =
        genForShowLoadBalancer();

    private static HttpRequestDef<ShowLoadBalancerRequest, ShowLoadBalancerResponse> genForShowLoadBalancer() {
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
            f -> f.withMarshaller(ShowLoadBalancerRequest::getLoadbalancerId,
                ShowLoadBalancerRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerPortsRequest, ShowLoadBalancerPortsResponse> showLoadBalancerPorts =
        genForShowLoadBalancerPorts();

    private static HttpRequestDef<ShowLoadBalancerPortsRequest, ShowLoadBalancerPortsResponse> genForShowLoadBalancerPorts() {
        // basic
        HttpRequestDef.Builder<ShowLoadBalancerPortsRequest, ShowLoadBalancerPortsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLoadBalancerPortsRequest.class, ShowLoadBalancerPortsResponse.class)
            .withName("ShowLoadBalancerPorts")
            .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/local-ports")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoadBalancerPortsRequest::getLoadbalancerId,
                ShowLoadBalancerPortsRequest::setLoadbalancerId));
        builder.<List<String>>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowLoadBalancerPortsRequest::getPortId, ShowLoadBalancerPortsRequest::setPortId));
        builder.<List<String>>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowLoadBalancerPortsRequest::getIpAddress,
                ShowLoadBalancerPortsRequest::setIpAddress));
        builder.<List<String>>withRequestField("ipv6_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowLoadBalancerPortsRequest::getIpv6Address,
                ShowLoadBalancerPortsRequest::setIpv6Address));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowLoadBalancerPortsRequest::getType, ShowLoadBalancerPortsRequest::setType));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowLoadBalancerPortsRequest::getVirsubnetId,
                ShowLoadBalancerPortsRequest::setVirsubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatus =
        genForShowLoadBalancerStatus();

    private static HttpRequestDef<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> genForShowLoadBalancerStatus() {
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
            f -> f.withMarshaller(ShowLoadBalancerStatusRequest::getLoadbalancerId,
                ShowLoadBalancerStatusRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogtankRequest, ShowLogtankResponse> showLogtank = genForShowLogtank();

    private static HttpRequestDef<ShowLogtankRequest, ShowLogtankResponse> genForShowLogtank() {
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
            f -> f.withMarshaller(ShowLogtankRequest::getLogtankId, ShowLogtankRequest::setLogtankId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse> showMasterSlavePool =
        genForShowMasterSlavePool();

    private static HttpRequestDef<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse> genForShowMasterSlavePool() {
        // basic
        HttpRequestDef.Builder<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMasterSlavePoolRequest.class, ShowMasterSlavePoolResponse.class)
                .withName("ShowMasterSlavePool")
                .withUri("/v3/{project_id}/elb/master-slave-pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMasterSlavePoolRequest::getPoolId, ShowMasterSlavePoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberRequest, ShowMemberResponse> showMember = genForShowMember();

    private static HttpRequestDef<ShowMemberRequest, ShowMemberResponse> genForShowMember() {
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
            f -> f.withMarshaller(ShowMemberRequest::getPoolId, ShowMemberRequest::setPoolId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberRequest::getMemberId, ShowMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberHealthCheckJobRequest, ShowMemberHealthCheckJobResponse> showMemberHealthCheckJob =
        genForShowMemberHealthCheckJob();

    private static HttpRequestDef<ShowMemberHealthCheckJobRequest, ShowMemberHealthCheckJobResponse> genForShowMemberHealthCheckJob() {
        // basic
        HttpRequestDef.Builder<ShowMemberHealthCheckJobRequest, ShowMemberHealthCheckJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowMemberHealthCheckJobRequest.class, ShowMemberHealthCheckJobResponse.class)
                .withName("ShowMemberHealthCheckJob")
                .withUri("/v3/{project_id}/elb/members/check/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberHealthCheckJobRequest::getJobId,
                ShowMemberHealthCheckJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForShowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForShowPool() {
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
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, ShowPoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
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

    public static final HttpRequestDef<ShowRecycleBinRequest, ShowRecycleBinResponse> showRecycleBin =
        genForShowRecycleBin();

    private static HttpRequestDef<ShowRecycleBinRequest, ShowRecycleBinResponse> genForShowRecycleBin() {
        // basic
        HttpRequestDef.Builder<ShowRecycleBinRequest, ShowRecycleBinResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecycleBinRequest.class, ShowRecycleBinResponse.class)
                .withName("ShowRecycleBin")
                .withUri("/v3/{project_id}/elb/recycle-bin")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicy =
        genForShowSecurityPolicy();

    private static HttpRequestDef<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> genForShowSecurityPolicy() {
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
            f -> f.withMarshaller(ShowSecurityPolicyRequest::getSecurityPolicyId,
                ShowSecurityPolicyRequest::setSecurityPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
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
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitor =
        genForUpdateHealthMonitor();

    private static HttpRequestDef<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> genForUpdateHealthMonitor() {
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
            f -> f.withMarshaller(UpdateHealthMonitorRequest::getHealthmonitorId,
                UpdateHealthMonitorRequest::setHealthmonitorId));
        builder.<UpdateHealthMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthMonitorRequestBody.class),
            f -> f.withMarshaller(UpdateHealthMonitorRequest::getBody, UpdateHealthMonitorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7Policy =
        genForUpdateL7Policy();

    private static HttpRequestDef<UpdateL7PolicyRequest, UpdateL7PolicyResponse> genForUpdateL7Policy() {
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
            f -> f.withMarshaller(UpdateL7PolicyRequest::getL7policyId, UpdateL7PolicyRequest::setL7policyId));
        builder.<UpdateL7PolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7PolicyRequestBody.class),
            f -> f.withMarshaller(UpdateL7PolicyRequest::getBody, UpdateL7PolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7Rule = genForUpdateL7Rule();

    private static HttpRequestDef<UpdateL7RuleRequest, UpdateL7RuleResponse> genForUpdateL7Rule() {
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
            f -> f.withMarshaller(UpdateL7RuleRequest::getL7policyId, UpdateL7RuleRequest::setL7policyId));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7RuleRequest::getL7ruleId, UpdateL7RuleRequest::setL7ruleId));
        builder.<UpdateL7RuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7RuleRequestBody.class),
            f -> f.withMarshaller(UpdateL7RuleRequest::getBody, UpdateL7RuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener =
        genForUpdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForUpdateListener() {
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
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, UpdateListenerRequest::setListenerId));
        builder.<UpdateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateListenerRequestBody.class),
            f -> f.withMarshaller(UpdateListenerRequest::getBody, UpdateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancer =
        genForUpdateLoadBalancer();

    private static HttpRequestDef<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> genForUpdateLoadBalancer() {
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
            f -> f.withMarshaller(UpdateLoadBalancerRequest::getLoadbalancerId,
                UpdateLoadBalancerRequest::setLoadbalancerId));
        builder.<UpdateLoadBalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoadBalancerRequestBody.class),
            f -> f.withMarshaller(UpdateLoadBalancerRequest::getBody, UpdateLoadBalancerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtank =
        genForUpdateLogtank();

    private static HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> genForUpdateLogtank() {
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
            f -> f.withMarshaller(UpdateLogtankRequest::getLogtankId, UpdateLogtankRequest::setLogtankId));
        builder.<UpdateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogtankRequestBody.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getBody, UpdateLogtankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForUpdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForUpdateMember() {
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
            f -> f.withMarshaller(UpdateMemberRequest::getMemberId, UpdateMemberRequest::setMemberId));
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getPoolId, UpdateMemberRequest::setPoolId));
        builder.<UpdateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberRequestBody.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, UpdateMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForUpdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForUpdatePool() {
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
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, UpdatePoolRequest::setPoolId));
        builder.<UpdatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePoolRequestBody.class),
            f -> f.withMarshaller(UpdatePoolRequest::getBody, UpdatePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecycleBinEnableRequest, UpdateRecycleBinEnableResponse> updateRecycleBinEnable =
        genForUpdateRecycleBinEnable();

    private static HttpRequestDef<UpdateRecycleBinEnableRequest, UpdateRecycleBinEnableResponse> genForUpdateRecycleBinEnable() {
        // basic
        HttpRequestDef.Builder<UpdateRecycleBinEnableRequest, UpdateRecycleBinEnableResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRecycleBinEnableRequest.class, UpdateRecycleBinEnableResponse.class)
            .withName("UpdateRecycleBinEnable")
            .withUri("/v3/{project_id}/elb/recycle-bin")
            .withContentType("application/json");

        // requests
        builder.<UpdateRecycleBinEnableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRecycleBinEnableRequestBody.class),
            f -> f.withMarshaller(UpdateRecycleBinEnableRequest::getBody, UpdateRecycleBinEnableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse> updateRecycleBinPolicy =
        genForUpdateRecycleBinPolicy();

    private static HttpRequestDef<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse> genForUpdateRecycleBinPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRecycleBinPolicyRequest.class, UpdateRecycleBinPolicyResponse.class)
            .withName("UpdateRecycleBinPolicy")
            .withUri("/v3/{project_id}/elb/recycle-bin/policy")
            .withContentType("application/json");

        // requests
        builder.<UpdateRecycleBinPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRecycleBinPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateRecycleBinPolicyRequest::getBody, UpdateRecycleBinPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicy =
        genForUpdateSecurityPolicy();

    private static HttpRequestDef<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> genForUpdateSecurityPolicy() {
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
            f -> f.withMarshaller(UpdateSecurityPolicyRequest::getSecurityPolicyId,
                UpdateSecurityPolicyRequest::setSecurityPolicyId));
        builder.<UpdateSecurityPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityPolicyRequest::getBody, UpdateSecurityPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeLoadbalancerRequest, UpgradeLoadbalancerResponse> upgradeLoadbalancer =
        genForUpgradeLoadbalancer();

    private static HttpRequestDef<UpgradeLoadbalancerRequest, UpgradeLoadbalancerResponse> genForUpgradeLoadbalancer() {
        // basic
        HttpRequestDef.Builder<UpgradeLoadbalancerRequest, UpgradeLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeLoadbalancerRequest.class, UpgradeLoadbalancerResponse.class)
                .withName("UpgradeLoadbalancer")
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/upgrade")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeLoadbalancerRequest::getLoadbalancerId,
                UpgradeLoadbalancerRequest::setLoadbalancerId));
        builder.<UpgradeV3RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeV3RequestBody.class),
            f -> f.withMarshaller(UpgradeLoadbalancerRequest::getBody, UpgradeLoadbalancerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
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
        genForBatchDeleteIpList();

    private static HttpRequestDef<BatchDeleteIpListRequest, BatchDeleteIpListResponse> genForBatchDeleteIpList() {
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
            f -> f.withMarshaller(BatchDeleteIpListRequest::getIpgroupId, BatchDeleteIpListRequest::setIpgroupId));
        builder.<BatchDeleteIpListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteIpListRequestBody.class),
            f -> f.withMarshaller(BatchDeleteIpListRequest::getBody, BatchDeleteIpListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNum =
        genForCountPreoccupyIpNum();

    private static HttpRequestDef<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> genForCountPreoccupyIpNum() {
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
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getL7FlavorId,
                CountPreoccupyIpNumRequest::setL7FlavorId));
        builder.<Boolean>withRequestField("ip_target_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getIpTargetEnable,
                CountPreoccupyIpNumRequest::setIpTargetEnable));
        builder.<Integer>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getIpVersion, CountPreoccupyIpNumRequest::setIpVersion));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getLoadbalancerId,
                CountPreoccupyIpNumRequest::setLoadbalancerId));
        builder.<List<String>>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getAvailabilityZoneId,
                CountPreoccupyIpNumRequest::setAvailabilityZoneId));
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getScene, CountPreoccupyIpNumRequest::setScene));
        builder.<Boolean>withRequestField("nat64_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getNat64Enable,
                CountPreoccupyIpNumRequest::setNat64Enable));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup =
        genForCreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForCreateIpGroup() {
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
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, CreateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genForDeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genForDeleteIpGroup() {
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
            f -> f.withMarshaller(DeleteIpGroupRequest::getIpgroupId, DeleteIpGroupRequest::setIpgroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroups = genForListIpGroups();

    private static HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> genForListIpGroups() {
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
            f -> f.withMarshaller(ListIpGroupsRequest::getMarker, ListIpGroupsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getLimit, ListIpGroupsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getPageReverse, ListIpGroupsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getId, ListIpGroupsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getName, ListIpGroupsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getDescription, ListIpGroupsRequest::setDescription));
        builder.<List<String>>withRequestField("ip_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getIpList, ListIpGroupsRequest::setIpList));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getEnterpriseProjectId,
                ListIpGroupsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForShowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForShowIpGroup() {
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
            f -> f.withMarshaller(ShowIpGroupRequest::getIpgroupId, ShowIpGroupRequest::setIpgroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRelatedListenersRequest, ShowIpGroupRelatedListenersResponse> showIpGroupRelatedListeners =
        genForShowIpGroupRelatedListeners();

    private static HttpRequestDef<ShowIpGroupRelatedListenersRequest, ShowIpGroupRelatedListenersResponse> genForShowIpGroupRelatedListeners() {
        // basic
        HttpRequestDef.Builder<ShowIpGroupRelatedListenersRequest, ShowIpGroupRelatedListenersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowIpGroupRelatedListenersRequest.class,
                    ShowIpGroupRelatedListenersResponse.class)
                .withName("ShowIpGroupRelatedListeners")
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}/related-listeners")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRelatedListenersRequest::getIpgroupId,
                ShowIpGroupRelatedListenersRequest::setIpgroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup =
        genForUpdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForUpdateIpGroup() {
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
            f -> f.withMarshaller(UpdateIpGroupRequest::getIpgroupId, UpdateIpGroupRequest::setIpgroupId));
        builder.<UpdateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, UpdateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpListRequest, UpdateIpListResponse> updateIpList = genForUpdateIpList();

    private static HttpRequestDef<UpdateIpListRequest, UpdateIpListResponse> genForUpdateIpList() {
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
            f -> f.withMarshaller(UpdateIpListRequest::getIpgroupId, UpdateIpListRequest::setIpgroupId));
        builder.<UpdateIpListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateIpListRequestBody.class),
            f -> f.withMarshaller(UpdateIpListRequest::getBody, UpdateIpListRequest::setBody));

        // response

        return builder.build();
    }

}
