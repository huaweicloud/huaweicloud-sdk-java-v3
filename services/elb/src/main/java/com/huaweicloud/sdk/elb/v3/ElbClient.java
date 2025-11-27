package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateLoadBalancersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateLoadBalancersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityResponse;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeRequest;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeResponse;
import com.huaweicloud.sdk.elb.v3.model.CloneLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.CloneLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.CountPreoccupyIpNumRequest;
import com.huaweicloud.sdk.elb.v3.model.CountPreoccupyIpNumResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificatePrivateKeyEchoRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificatePrivateKeyEchoResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberHealthCheckJobRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberHealthCheckJobResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateSecurityPolicyRequest;
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
import com.huaweicloud.sdk.elb.v3.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinEnableRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinEnableResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateRecycleBinPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpgradeLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpgradeLoadbalancerResponse;

public class ElbClient {

    protected HcClient hcClient;

    public ElbClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbClient> newBuilder() {
        ClientBuilder<ElbClient> clientBuilder = new ClientBuilder<>(ElbClient::new);
        return clientBuilder;
    }

    /**
     * 新增负载均衡器可用区
     *
     * 给负载均衡器新增可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAvailableZonesRequest 请求对象
     * @return BatchAddAvailableZonesResponse
     */
    public BatchAddAvailableZonesResponse batchAddAvailableZones(BatchAddAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchAddAvailableZones);
    }

    /**
     * 新增负载均衡器可用区
     *
     * 给负载均衡器新增可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAvailableZonesRequest 请求对象
     * @return SyncInvoker<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse>
     */
    public SyncInvoker<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse> batchAddAvailableZonesInvoker(
        BatchAddAvailableZonesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchAddAvailableZones, hcClient);
    }

    /**
     * 批量创建负载均衡器
     *
     * [批量创建独享型或者共享型负载均衡器，包括按需及包周期计费负载均衡器。](tag:hws)
     * [批量创建独享型或者共享型负载均衡器。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,dt,ctc,cmcc,sbc,hk_sbc)
     * [批量创建负载均衡器。](tag:hcso,hk_vdf,srg,fcs,tm,hk_tm,ct)
     * - 若要创建内网IPv4负载均衡器，则需要传入vip_subnet_cidr_id。
     * - 若要创建公网IPv4负载均衡器，则需要传入publicip，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要绑定有已有公网IPv4地址，则需要传入publicip_ids，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要创建内网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id。
     * - 若要创建公网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * - 若要创建网络型负载均衡器，则需要传入l4_flavor_id（网络型规格ID）；若要创建应用型负载均衡器，则需要传入l7_flavor_id（应用型规格ID）；若要创建网络型+应用型负载均衡器，则需要传入l4_flavor_id和l7_flavor_id。
     * - 如果批量创建的负载均衡器数量大于1，则不支持绑定已有的公网IP，且不支持指定ipv4和ipv6地址。即number大于1时，不支持传入publicip_ids，vip_address和ipv6_vip_address字段。
     * [- 若要创建包周期负载均衡器，则需要传入prepaid_options，否则创建按需计费负载均衡器。](tag:hws)
     * - 按需计费分为固定规格计费和弹性规格计费，根据创建时所选规格的类型决定计费方式。具体规格说明见创建LB请求参数l4_flavor_id和l7_flavor_id。
     * - 异步接口，返回体中包含需要批量创建的负载均衡的ID列表和批量创建负载均衡器的job ID，可以通过job ID查询当前批量创建负载均衡器的进度。
     * - 批量创建独享型和共享型实例时，请求体传参规则有所不同，具体见请求体说明中各个参数的解释。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateLoadBalancersRequest 请求对象
     * @return BatchCreateLoadBalancersResponse
     */
    public BatchCreateLoadBalancersResponse batchCreateLoadBalancers(BatchCreateLoadBalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchCreateLoadBalancers);
    }

    /**
     * 批量创建负载均衡器
     *
     * [批量创建独享型或者共享型负载均衡器，包括按需及包周期计费负载均衡器。](tag:hws)
     * [批量创建独享型或者共享型负载均衡器。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,dt,ctc,cmcc,sbc,hk_sbc)
     * [批量创建负载均衡器。](tag:hcso,hk_vdf,srg,fcs,tm,hk_tm,ct)
     * - 若要创建内网IPv4负载均衡器，则需要传入vip_subnet_cidr_id。
     * - 若要创建公网IPv4负载均衡器，则需要传入publicip，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要绑定有已有公网IPv4地址，则需要传入publicip_ids，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要创建内网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id。
     * - 若要创建公网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * - 若要创建网络型负载均衡器，则需要传入l4_flavor_id（网络型规格ID）；若要创建应用型负载均衡器，则需要传入l7_flavor_id（应用型规格ID）；若要创建网络型+应用型负载均衡器，则需要传入l4_flavor_id和l7_flavor_id。
     * - 如果批量创建的负载均衡器数量大于1，则不支持绑定已有的公网IP，且不支持指定ipv4和ipv6地址。即number大于1时，不支持传入publicip_ids，vip_address和ipv6_vip_address字段。
     * [- 若要创建包周期负载均衡器，则需要传入prepaid_options，否则创建按需计费负载均衡器。](tag:hws)
     * - 按需计费分为固定规格计费和弹性规格计费，根据创建时所选规格的类型决定计费方式。具体规格说明见创建LB请求参数l4_flavor_id和l7_flavor_id。
     * - 异步接口，返回体中包含需要批量创建的负载均衡的ID列表和批量创建负载均衡器的job ID，可以通过job ID查询当前批量创建负载均衡器的进度。
     * - 批量创建独享型和共享型实例时，请求体传参规则有所不同，具体见请求体说明中各个参数的解释。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateLoadBalancersRequest 请求对象
     * @return SyncInvoker<BatchCreateLoadBalancersRequest, BatchCreateLoadBalancersResponse>
     */
    public SyncInvoker<BatchCreateLoadBalancersRequest, BatchCreateLoadBalancersResponse> batchCreateLoadBalancersInvoker(
        BatchCreateLoadBalancersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchCreateLoadBalancers, hcClient);
    }

    /**
     * 批量创建后端服务器
     *
     * 在指定pool下批量创建后端服务器。一次最多创建200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateMembersRequest 请求对象
     * @return BatchCreateMembersResponse
     */
    public BatchCreateMembersResponse batchCreateMembers(BatchCreateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchCreateMembers);
    }

    /**
     * 批量创建后端服务器
     *
     * 在指定pool下批量创建后端服务器。一次最多创建200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateMembersRequest 请求对象
     * @return SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse>
     */
    public SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembersInvoker(
        BatchCreateMembersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchCreateMembers, hcClient);
    }

    /**
     * 批量删除后端服务器
     *
     * 在指定pool下批量删除后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersRequest 请求对象
     * @return BatchDeleteMembersResponse
     */
    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteMembers);
    }

    /**
     * 批量删除后端服务器
     *
     * 在指定pool下批量删除后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersRequest 请求对象
     * @return SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>
     */
    public SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersInvoker(
        BatchDeleteMembersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchDeleteMembers, hcClient);
    }

    /**
     * 移除负载均衡器可用区
     *
     * 移除负载均衡器的可用区。
     * &gt; 移除可用区可能导致已有连接断开，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveAvailableZonesRequest 请求对象
     * @return BatchRemoveAvailableZonesResponse
     */
    public BatchRemoveAvailableZonesResponse batchRemoveAvailableZones(BatchRemoveAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchRemoveAvailableZones);
    }

    /**
     * 移除负载均衡器可用区
     *
     * 移除负载均衡器的可用区。
     * &gt; 移除可用区可能导致已有连接断开，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveAvailableZonesRequest 请求对象
     * @return SyncInvoker<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse>
     */
    public SyncInvoker<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse> batchRemoveAvailableZonesInvoker(
        BatchRemoveAvailableZonesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchRemoveAvailableZones, hcClient);
    }

    /**
     * 批量更新后端服务器
     *
     * 在指定pool下批量更新后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateMembersRequest 请求对象
     * @return BatchUpdateMembersResponse
     */
    public BatchUpdateMembersResponse batchUpdateMembers(BatchUpdateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchUpdateMembers);
    }

    /**
     * 批量更新后端服务器
     *
     * 在指定pool下批量更新后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateMembersRequest 请求对象
     * @return SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>
     */
    public SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersInvoker(
        BatchUpdateMembersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchUpdateMembers, hcClient);
    }

    /**
     * 批量更新转发策略优先级
     *
     * 批量更新转发策略的优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoliciesPriorityRequest 请求对象
     * @return BatchUpdatePoliciesPriorityResponse
     */
    public BatchUpdatePoliciesPriorityResponse batchUpdatePoliciesPriority(BatchUpdatePoliciesPriorityRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchUpdatePoliciesPriority);
    }

    /**
     * 批量更新转发策略优先级
     *
     * 批量更新转发策略的优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoliciesPriorityRequest 请求对象
     * @return SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse>
     */
    public SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityInvoker(
        BatchUpdatePoliciesPriorityRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchUpdatePoliciesPriority, hcClient);
    }

    /**
     * 变更负载均衡器计费模式
     *
     * 负载均衡器计费模式变更，当前支持的计费模式变更为：
     * 1. 按需计费转包周期计费。
     * 2. 按需按规格计费转按需按使用量计费。
     * 3. 按需按使用量计费转按需按规格计费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeLoadbalancerChargeModeRequest 请求对象
     * @return ChangeLoadbalancerChargeModeResponse
     */
    public ChangeLoadbalancerChargeModeResponse changeLoadbalancerChargeMode(
        ChangeLoadbalancerChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.changeLoadbalancerChargeMode);
    }

    /**
     * 变更负载均衡器计费模式
     *
     * 负载均衡器计费模式变更，当前支持的计费模式变更为：
     * 1. 按需计费转包周期计费。
     * 2. 按需按规格计费转按需按使用量计费。
     * 3. 按需按使用量计费转按需按规格计费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeLoadbalancerChargeModeRequest 请求对象
     * @return SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse>
     */
    public SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeInvoker(
        ChangeLoadbalancerChargeModeRequest request) {
        return new SyncInvoker<>(request, ElbMeta.changeLoadbalancerChargeMode, hcClient);
    }

    /**
     * 复制已有负载均衡器
     *
     * 复制已有的负载均衡器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloneLoadbalancerRequest 请求对象
     * @return CloneLoadbalancerResponse
     */
    public CloneLoadbalancerResponse cloneLoadbalancer(CloneLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.cloneLoadbalancer);
    }

    /**
     * 复制已有负载均衡器
     *
     * 复制已有的负载均衡器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloneLoadbalancerRequest 请求对象
     * @return SyncInvoker<CloneLoadbalancerRequest, CloneLoadbalancerResponse>
     */
    public SyncInvoker<CloneLoadbalancerRequest, CloneLoadbalancerResponse> cloneLoadbalancerInvoker(
        CloneLoadbalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.cloneLoadbalancer, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建用于弹性负载均衡器HTTPS/TLS/QUIC协议监听器的证书。支持关联云证书与管理服务(CCM)的证书，或者使用自有证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建用于弹性负载均衡器HTTPS/TLS/QUIC协议监听器的证书。支持关联云证书与管理服务(CCM)的证书，或者使用自有证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createCertificate, hcClient);
    }

    /**
     * 修改证书私钥字段回显开关
     *
     * 开启或关闭ELB证书的私钥字段回显开关。该开关用于设置各个ELB证书接口的响应字段private_key和enc_private_key是否展示。若开启则证书的详情、列表、更新和创建接口返回私钥内容；不开启则返回脱敏后内容（******）。该开关影响整个租户项目（project），默认开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificatePrivateKeyEchoRequest 请求对象
     * @return CreateCertificatePrivateKeyEchoResponse
     */
    public CreateCertificatePrivateKeyEchoResponse createCertificatePrivateKeyEcho(
        CreateCertificatePrivateKeyEchoRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificatePrivateKeyEcho);
    }

    /**
     * 修改证书私钥字段回显开关
     *
     * 开启或关闭ELB证书的私钥字段回显开关。该开关用于设置各个ELB证书接口的响应字段private_key和enc_private_key是否展示。若开启则证书的详情、列表、更新和创建接口返回私钥内容；不开启则返回脱敏后内容（******）。该开关影响整个租户项目（project），默认开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificatePrivateKeyEchoRequest 请求对象
     * @return SyncInvoker<CreateCertificatePrivateKeyEchoRequest, CreateCertificatePrivateKeyEchoResponse>
     */
    public SyncInvoker<CreateCertificatePrivateKeyEchoRequest, CreateCertificatePrivateKeyEchoResponse> createCertificatePrivateKeyEchoInvoker(
        CreateCertificatePrivateKeyEchoRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createCertificatePrivateKeyEcho, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthMonitorRequest 请求对象
     * @return CreateHealthMonitorResponse
     */
    public CreateHealthMonitorResponse createHealthMonitor(CreateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthMonitorRequest 请求对象
     * @return SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>
     */
    public SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorInvoker(
        CreateHealthMonitorRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createHealthMonitor, hcClient);
    }

    /**
     * 创建转发策略
     *
     * 创建七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7PolicyRequest 请求对象
     * @return CreateL7PolicyResponse
     */
    public CreateL7PolicyResponse createL7Policy(CreateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    /**
     * 创建转发策略
     *
     * 创建七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7PolicyRequest 请求对象
     * @return SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>
     */
    public SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyInvoker(
        CreateL7PolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createL7Policy, hcClient);
    }

    /**
     * 创建转发规则
     *
     * 创建七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7RuleRequest 请求对象
     * @return CreateL7RuleResponse
     */
    public CreateL7RuleResponse createL7Rule(CreateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    /**
     * 创建转发规则
     *
     * 创建七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7RuleRequest 请求对象
     * @return SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>
     */
    public SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleInvoker(CreateL7RuleRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createL7Rule, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。支持通过该接口创建独享型及共享型LB实例下的监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。支持通过该接口创建独享型及共享型LB实例下的监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return SyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(
        CreateListenerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createListener, hcClient);
    }

    /**
     * 创建负载均衡器
     *
     * [创建独享型负载均衡器，包括按需及包周期计费负载均衡器。](tag:hws)
     * [创建独享型负载均衡器。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,dt,ctc,cmcc,sbc,hk_sbc)
     * [创建负载均衡器。](tag:hcso,hk_vdf,srg,fcs,tm,hk_tm,ct)
     * 
     * - 若要创建内网IPv4负载均衡器，则需要传入vip_subnet_cidr_id。
     * - 若要创建公网IPv4负载均衡器，则需要传入publicip，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要绑定有已有公网IPv4地址，则需要传入publicip_ids，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要创建内网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id。
     * - 若要创建公网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * - 若要创建网络型负载均衡器，则需要传入l4_flavor_id（网络型规格ID）；若要创建应用型负载均衡器，则需要传入l7_flavor_id（应用型规格ID）；若要创建网络型+应用型负载均衡器，则需要传入l4_flavor_id和l7_flavor_id。
     * [- 若要创建包周期负载均衡器，则需要传入prepaid_options，否则创建按需计费负载均衡器。](tag:hws)
     * - 按需计费分为固定规格计费和弹性规格计费，根据创建时所选规格的类型决定计费方式。具体规格说明见创建LB请求参数l4_flavor_id和l7_flavor_id。
     * [- 若要创建gateway类型的负载均衡器，则需要：
     *    - 指定loadbalancer_type&#x3D;\&quot;gateway\&quot;，且不支持指定vip_address，ipv6_vip_address。
     *    - vip_subnet_cidr_id和ipv6_subnet_cidr_id两者不能都为空，如果两者都传入，则必须属于同一子网。 
     *    - 不支持创建公网gateway类型LB。
     *    - 如果要指定规格，则从请求参数gw_flavor_id传入。](tag:hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadBalancerRequest 请求对象
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    /**
     * 创建负载均衡器
     *
     * [创建独享型负载均衡器，包括按需及包周期计费负载均衡器。](tag:hws)
     * [创建独享型负载均衡器。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,dt,ctc,cmcc,sbc,hk_sbc)
     * [创建负载均衡器。](tag:hcso,hk_vdf,srg,fcs,tm,hk_tm,ct)
     * 
     * - 若要创建内网IPv4负载均衡器，则需要传入vip_subnet_cidr_id。
     * - 若要创建公网IPv4负载均衡器，则需要传入publicip，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要绑定有已有公网IPv4地址，则需要传入publicip_ids，以及传入vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * - 若要创建内网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id。
     * - 若要创建公网双栈负载均衡器，则需要传入ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * - 若要创建网络型负载均衡器，则需要传入l4_flavor_id（网络型规格ID）；若要创建应用型负载均衡器，则需要传入l7_flavor_id（应用型规格ID）；若要创建网络型+应用型负载均衡器，则需要传入l4_flavor_id和l7_flavor_id。
     * [- 若要创建包周期负载均衡器，则需要传入prepaid_options，否则创建按需计费负载均衡器。](tag:hws)
     * - 按需计费分为固定规格计费和弹性规格计费，根据创建时所选规格的类型决定计费方式。具体规格说明见创建LB请求参数l4_flavor_id和l7_flavor_id。
     * [- 若要创建gateway类型的负载均衡器，则需要：
     *    - 指定loadbalancer_type&#x3D;\&quot;gateway\&quot;，且不支持指定vip_address，ipv6_vip_address。
     *    - vip_subnet_cidr_id和ipv6_subnet_cidr_id两者不能都为空，如果两者都传入，则必须属于同一子网。 
     *    - 不支持创建公网gateway类型LB。
     *    - 如果要指定规格，则从请求参数gw_flavor_id传入。](tag:hws_eu)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadBalancerRequest 请求对象
     * @return SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>
     */
    public SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerInvoker(
        CreateLoadBalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createLoadBalancer, hcClient);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return CreateLogtankResponse
     */
    public CreateLogtankResponse createLogtank(CreateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLogtank);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>
     */
    public SyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankInvoker(CreateLogtankRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createLogtank, hcClient);
    }

    /**
     * 创建主备后端服务器组
     *
     * 创建主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMasterSlavePoolRequest 请求对象
     * @return CreateMasterSlavePoolResponse
     */
    public CreateMasterSlavePoolResponse createMasterSlavePool(CreateMasterSlavePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMasterSlavePool);
    }

    /**
     * 创建主备后端服务器组
     *
     * 创建主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMasterSlavePoolRequest 请求对象
     * @return SyncInvoker<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse>
     */
    public SyncInvoker<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse> createMasterSlavePoolInvoker(
        CreateMasterSlavePoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createMasterSlavePool, hcClient);
    }

    /**
     * 创建后端服务器
     *
     * 创建后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberRequest 请求对象
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(CreateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端服务器
     *
     * 创建后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberRequest 请求对象
     * @return SyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public SyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberInvoker(CreateMemberRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createMember, hcClient);
    }

    /**
     * 创建后端服务器检测任务
     *
     * 创建后端服务器检测任务。包括后端服务器的配置、ACL规则和安全组规则检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberHealthCheckJobRequest 请求对象
     * @return CreateMemberHealthCheckJobResponse
     */
    public CreateMemberHealthCheckJobResponse createMemberHealthCheckJob(CreateMemberHealthCheckJobRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMemberHealthCheckJob);
    }

    /**
     * 创建后端服务器检测任务
     *
     * 创建后端服务器检测任务。包括后端服务器的配置、ACL规则和安全组规则检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberHealthCheckJobRequest 请求对象
     * @return SyncInvoker<CreateMemberHealthCheckJobRequest, CreateMemberHealthCheckJobResponse>
     */
    public SyncInvoker<CreateMemberHealthCheckJobRequest, CreateMemberHealthCheckJobResponse> createMemberHealthCheckJobInvoker(
        CreateMemberHealthCheckJobRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createMemberHealthCheckJob, hcClient);
    }

    /**
     * 创建后端服务器组
     *
     * 创建后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建后端服务器组
     *
     * 创建后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return SyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createPool, hcClient);
    }

    /**
     * 创建自定义安全策略
     *
     * 创建自定义安全策略。用于在创建HTTPS/TLS监听器时，请求参数中指定security_policy_id来设置监听器的自定义安全策略。
     * 
     * [荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPolicyRequest 请求对象
     * @return CreateSecurityPolicyResponse
     */
    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createSecurityPolicy);
    }

    /**
     * 创建自定义安全策略
     *
     * 创建自定义安全策略。用于在创建HTTPS/TLS监听器时，请求参数中指定security_policy_id来设置监听器的自定义安全策略。
     * 
     * [荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPolicyRequest 请求对象
     * @return SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>
     */
    public SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicyInvoker(
        CreateSecurityPolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createSecurityPolicy, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除ELB证书。若是删除source&#x3D;scm的证书，关联的云证书与管理服务（CCM）中的证书不会被删除。若想删除已关联到监听器的证书，则需要先解除监听器和证书的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除ELB证书。若是删除source&#x3D;scm的证书，关联的云证书与管理服务（CCM）中的证书不会被删除。若想删除已关联到监听器的证书，则需要先解除监听器和证书的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteCertificate, hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthMonitorRequest 请求对象
     * @return DeleteHealthMonitorResponse
     */
    public DeleteHealthMonitorResponse deleteHealthMonitor(DeleteHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthMonitorRequest 请求对象
     * @return SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>
     */
    public SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorInvoker(
        DeleteHealthMonitorRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteHealthMonitor, hcClient);
    }

    /**
     * 删除转发策略
     *
     * 删除七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7PolicyRequest 请求对象
     * @return DeleteL7PolicyResponse
     */
    public DeleteL7PolicyResponse deleteL7Policy(DeleteL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    /**
     * 删除转发策略
     *
     * 删除七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7PolicyRequest 请求对象
     * @return SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>
     */
    public SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyInvoker(
        DeleteL7PolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteL7Policy, hcClient);
    }

    /**
     * 删除转发规则
     *
     * 删除七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7RuleRequest 请求对象
     * @return DeleteL7RuleResponse
     */
    public DeleteL7RuleResponse deleteL7Rule(DeleteL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    /**
     * 删除转发规则
     *
     * 删除七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7RuleRequest 请求对象
     * @return SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>
     */
    public SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleInvoker(DeleteL7RuleRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteL7Rule, hcClient);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(
        DeleteListenerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteListener, hcClient);
    }

    /**
     * 级联删除监听器
     *
     * 删除监听器且级联删除其下子资源（删除监听器、转发策略等，解绑后端服务器组）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerForceRequest 请求对象
     * @return DeleteListenerForceResponse
     */
    public DeleteListenerForceResponse deleteListenerForce(DeleteListenerForceRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListenerForce);
    }

    /**
     * 级联删除监听器
     *
     * 删除监听器且级联删除其下子资源（删除监听器、转发策略等，解绑后端服务器组）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerForceRequest 请求对象
     * @return SyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse>
     */
    public SyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse> deleteListenerForceInvoker(
        DeleteListenerForceRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteListenerForce, hcClient);
    }

    /**
     * 删除负载均衡器
     *
     * 删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerRequest 请求对象
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    /**
     * 删除负载均衡器
     *
     * 删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerRequest 请求对象
     * @return SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
     */
    public SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerInvoker(
        DeleteLoadBalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteLoadBalancer, hcClient);
    }

    /**
     * 级联删除负载均衡器及关联EIP
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器等一系列资源）。以及根据需要删除或解绑后端服务器组和LB关联的EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerCascadeRequest 请求对象
     * @return DeleteLoadBalancerCascadeResponse
     */
    public DeleteLoadBalancerCascadeResponse deleteLoadBalancerCascade(DeleteLoadBalancerCascadeRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancerCascade);
    }

    /**
     * 级联删除负载均衡器及关联EIP
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器等一系列资源）。以及根据需要删除或解绑后端服务器组和LB关联的EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerCascadeRequest 请求对象
     * @return SyncInvoker<DeleteLoadBalancerCascadeRequest, DeleteLoadBalancerCascadeResponse>
     */
    public SyncInvoker<DeleteLoadBalancerCascadeRequest, DeleteLoadBalancerCascadeResponse> deleteLoadBalancerCascadeInvoker(
        DeleteLoadBalancerCascadeRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteLoadBalancerCascade, hcClient);
    }

    /**
     * 级联删除负载均衡器
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器组、后端服务器等一系列资源）。
     * - 若LB关联了EIP，则只解绑EIP，不会删除EIP。
     * [- 若已开启多挂特性，且关联了多个LB，则只做解绑；否则删除。
     * - 若是共享型LB下的后端服务器组，无论是否多挂都只删除，不解绑。](tag:hc,hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerForceRequest 请求对象
     * @return DeleteLoadBalancerForceResponse
     */
    public DeleteLoadBalancerForceResponse deleteLoadBalancerForce(DeleteLoadBalancerForceRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancerForce);
    }

    /**
     * 级联删除负载均衡器
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器组、后端服务器等一系列资源）。
     * - 若LB关联了EIP，则只解绑EIP，不会删除EIP。
     * [- 若已开启多挂特性，且关联了多个LB，则只做解绑；否则删除。
     * - 若是共享型LB下的后端服务器组，无论是否多挂都只删除，不解绑。](tag:hc,hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerForceRequest 请求对象
     * @return SyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse>
     */
    public SyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> deleteLoadBalancerForceInvoker(
        DeleteLoadBalancerForceRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteLoadBalancerForce, hcClient);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return DeleteLogtankResponse
     */
    public DeleteLogtankResponse deleteLogtank(DeleteLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLogtank);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>
     */
    public SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankInvoker(DeleteLogtankRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteLogtank, hcClient);
    }

    /**
     * 删除主备后端服务器组
     *
     * 删除主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMasterSlavePoolRequest 请求对象
     * @return DeleteMasterSlavePoolResponse
     */
    public DeleteMasterSlavePoolResponse deleteMasterSlavePool(DeleteMasterSlavePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMasterSlavePool);
    }

    /**
     * 删除主备后端服务器组
     *
     * 删除主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMasterSlavePoolRequest 请求对象
     * @return SyncInvoker<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse>
     */
    public SyncInvoker<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse> deleteMasterSlavePoolInvoker(
        DeleteMasterSlavePoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteMasterSlavePool, hcClient);
    }

    /**
     * 删除后端服务器
     *
     * 删除后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端服务器
     *
     * 删除后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteMember, hcClient);
    }

    /**
     * 删除后端服务器组
     *
     * 删除后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除后端服务器组
     *
     * 删除后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return SyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 级联删除后端服务器组
     *
     * 级联删除后端服务器组，包含在此后端服务器组下的所有后端服务器和健康检查也将被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolCascadeRequest 请求对象
     * @return DeletePoolCascadeResponse
     */
    public DeletePoolCascadeResponse deletePoolCascade(DeletePoolCascadeRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePoolCascade);
    }

    /**
     * 级联删除后端服务器组
     *
     * 级联删除后端服务器组，包含在此后端服务器组下的所有后端服务器和健康检查也将被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolCascadeRequest 请求对象
     * @return SyncInvoker<DeletePoolCascadeRequest, DeletePoolCascadeResponse>
     */
    public SyncInvoker<DeletePoolCascadeRequest, DeletePoolCascadeResponse> deletePoolCascadeInvoker(
        DeletePoolCascadeRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deletePoolCascade, hcClient);
    }

    /**
     * 销毁回收站负载均衡器
     *
     * 销毁回收站负载均衡器。销毁后无法再还原。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecycleLoadBalancerRequest 请求对象
     * @return DeleteRecycleLoadBalancerResponse
     */
    public DeleteRecycleLoadBalancerResponse deleteRecycleLoadBalancer(DeleteRecycleLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteRecycleLoadBalancer);
    }

    /**
     * 销毁回收站负载均衡器
     *
     * 销毁回收站负载均衡器。销毁后无法再还原。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecycleLoadBalancerRequest 请求对象
     * @return SyncInvoker<DeleteRecycleLoadBalancerRequest, DeleteRecycleLoadBalancerResponse>
     */
    public SyncInvoker<DeleteRecycleLoadBalancerRequest, DeleteRecycleLoadBalancerResponse> deleteRecycleLoadBalancerInvoker(
        DeleteRecycleLoadBalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteRecycleLoadBalancer, hcClient);
    }

    /**
     * 删除自定义安全策略
     *
     * 删除自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPolicyRequest 请求对象
     * @return DeleteSecurityPolicyResponse
     */
    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteSecurityPolicy);
    }

    /**
     * 删除自定义安全策略
     *
     * 删除自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPolicyRequest 请求对象
     * @return SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>
     */
    public SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicyInvoker(
        DeleteSecurityPolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteSecurityPolicy, hcClient);
    }

    /**
     * 后端服务器全局列表
     *
     * 查询当前项目下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllMembersRequest 请求对象
     * @return ListAllMembersResponse
     */
    public ListAllMembersResponse listAllMembers(ListAllMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    /**
     * 后端服务器全局列表
     *
     * 查询当前项目下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllMembersRequest 请求对象
     * @return SyncInvoker<ListAllMembersRequest, ListAllMembersResponse>
     */
    public SyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersInvoker(
        ListAllMembersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listAllMembers, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 返回租户创建LB时可使用的可用区集合列表情况。
     * 
     * - 默认情况下，会返回一个可用区集合。
     * 在（如创建LB）设置可用区时，填写的可用区必须包含在可用区集合中、为这个可用区集合的子集。
     * 
     * - 如果传入了loadbalancer_id，则返回该负载均衡器所在集群的可用区集合
     * 
     * - 特殊场景下，部分客户要求负载均衡只能创建在指定可用区集合中，此时会返回客户定制的可用区集合。
     * 返回可用区集合可能为一个也可能为多个，比如列表有两个可用区集合\\[az1,az2\\],\\[az2,az3\\]。
     * 在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，
     * 如可以选az2和az3，但不能选择az1和az3。你可以选择多个可用区，只要这些可用区在一个子集中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 返回租户创建LB时可使用的可用区集合列表情况。
     * 
     * - 默认情况下，会返回一个可用区集合。
     * 在（如创建LB）设置可用区时，填写的可用区必须包含在可用区集合中、为这个可用区集合的子集。
     * 
     * - 如果传入了loadbalancer_id，则返回该负载均衡器所在集群的可用区集合
     * 
     * - 特殊场景下，部分客户要求负载均衡只能创建在指定可用区集合中，此时会返回客户定制的可用区集合。
     * 返回可用区集合可能为一个也可能为多个，比如列表有两个可用区集合\\[az1,az2\\],\\[az2,az3\\]。
     * 在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，
     * 如可以选az2和az3，但不能选择az1和az3。你可以选择多个可用区，只要这些可用区在一个子集中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询ELB证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询ELB证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listCertificates, hcClient);
    }

    /**
     * 查询当前租户ELB服务的特性配置
     *
     * 查询当前租户ELB服务的特性配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeatureConfigsRequest 请求对象
     * @return ListFeatureConfigsResponse
     */
    public ListFeatureConfigsResponse listFeatureConfigs(ListFeatureConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listFeatureConfigs);
    }

    /**
     * 查询当前租户ELB服务的特性配置
     *
     * 查询当前租户ELB服务的特性配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeatureConfigsRequest 请求对象
     * @return SyncInvoker<ListFeatureConfigsRequest, ListFeatureConfigsResponse>
     */
    public SyncInvoker<ListFeatureConfigsRequest, ListFeatureConfigsResponse> listFeatureConfigsInvoker(
        ListFeatureConfigsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listFeatureConfigs, hcClient);
    }

    /**
     * 查询规格列表
     *
     * 查询当前局点可用的负载均衡器规格。用于在创建独享型负载均衡器时指定4层或7层规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listFlavors);
    }

    /**
     * 查询规格列表
     *
     * 查询当前局点可用的负载均衡器规格。用于在创建独享型负载均衡器时指定4层或7层规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listFlavors, hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthMonitorsRequest 请求对象
     * @return ListHealthMonitorsResponse
     */
    public ListHealthMonitorsResponse listHealthMonitors(ListHealthMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    /**
     * 查询健康检查列表
     *
     * 健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthMonitorsRequest 请求对象
     * @return SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>
     */
    public SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsInvoker(
        ListHealthMonitorsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listHealthMonitors, hcClient);
    }

    /**
     * 查询异步任务的job列表
     *
     * 用于查询实例复制、实例升级等异步接口任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listJobs);
    }

    /**
     * 查询异步任务的job列表
     *
     * 用于查询实例复制、实例升级等异步接口任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listJobs, hcClient);
    }

    /**
     * 查询转发策略列表
     *
     * 查询七层转发策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7PoliciesRequest 请求对象
     * @return ListL7PoliciesResponse
     */
    public ListL7PoliciesResponse listL7Policies(ListL7PoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    /**
     * 查询转发策略列表
     *
     * 查询七层转发策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7PoliciesRequest 请求对象
     * @return SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>
     */
    public SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesInvoker(
        ListL7PoliciesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listL7Policies, hcClient);
    }

    /**
     * 查询转发规则列表
     *
     * 查询转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7RulesRequest 请求对象
     * @return ListL7RulesResponse
     */
    public ListL7RulesResponse listL7Rules(ListL7RulesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    /**
     * 查询转发规则列表
     *
     * 查询转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7RulesRequest 请求对象
     * @return SyncInvoker<ListL7RulesRequest, ListL7RulesResponse>
     */
    public SyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesInvoker(ListL7RulesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listL7Rules, hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return SyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listListeners, hcClient);
    }

    /**
     * 查询负载均衡器列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoadBalancersRequest 请求对象
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    /**
     * 查询负载均衡器列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoadBalancersRequest 请求对象
     * @return SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>
     */
    public SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersInvoker(
        ListLoadBalancersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listLoadBalancers, hcClient);
    }

    /**
     * 查询指定ELB实例的特性配置
     *
     * 查询指定ELB实例的特性配置情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoadbalancerFeatureRequest 请求对象
     * @return ListLoadbalancerFeatureResponse
     */
    public ListLoadbalancerFeatureResponse listLoadbalancerFeature(ListLoadbalancerFeatureRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadbalancerFeature);
    }

    /**
     * 查询指定ELB实例的特性配置
     *
     * 查询指定ELB实例的特性配置情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoadbalancerFeatureRequest 请求对象
     * @return SyncInvoker<ListLoadbalancerFeatureRequest, ListLoadbalancerFeatureResponse>
     */
    public SyncInvoker<ListLoadbalancerFeatureRequest, ListLoadbalancerFeatureResponse> listLoadbalancerFeatureInvoker(
        ListLoadbalancerFeatureRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listLoadbalancerFeature, hcClient);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtanksRequest 请求对象
     * @return ListLogtanksResponse
     */
    public ListLogtanksResponse listLogtanks(ListLogtanksRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLogtanks);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtanksRequest 请求对象
     * @return SyncInvoker<ListLogtanksRequest, ListLogtanksResponse>
     */
    public SyncInvoker<ListLogtanksRequest, ListLogtanksResponse> listLogtanksInvoker(ListLogtanksRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listLogtanks, hcClient);
    }

    /**
     * 查询主备后端服务器组列表
     *
     * 主备后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMasterSlavePoolsRequest 请求对象
     * @return ListMasterSlavePoolsResponse
     */
    public ListMasterSlavePoolsResponse listMasterSlavePools(ListMasterSlavePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMasterSlavePools);
    }

    /**
     * 查询主备后端服务器组列表
     *
     * 主备后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMasterSlavePoolsRequest 请求对象
     * @return SyncInvoker<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse>
     */
    public SyncInvoker<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse> listMasterSlavePoolsInvoker(
        ListMasterSlavePoolsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listMasterSlavePools, hcClient);
    }

    /**
     * 查询后端服务器列表
     *
     * Pool下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端服务器列表
     *
     * Pool下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listMembers, hcClient);
    }

    /**
     * 查询后端服务器组列表
     *
     * 查询后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询后端服务器组列表
     *
     * 查询后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listPools, hcClient);
    }

    /**
     * 查询配额使用详情
     *
     * 查询负载均衡服务相关的各类资源的当前配额和已使用配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return ListQuotaDetailsResponse
     */
    public ListQuotaDetailsResponse listQuotaDetails(ListQuotaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listQuotaDetails);
    }

    /**
     * 查询配额使用详情
     *
     * 查询负载均衡服务相关的各类资源的当前配额和已使用配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>
     */
    public SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsInvoker(
        ListQuotaDetailsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listQuotaDetails, hcClient);
    }

    /**
     * 查询回收站负载均衡器列表
     *
     * 查询回收站负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleBinLoadBalancersRequest 请求对象
     * @return ListRecycleBinLoadBalancersResponse
     */
    public ListRecycleBinLoadBalancersResponse listRecycleBinLoadBalancers(ListRecycleBinLoadBalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listRecycleBinLoadBalancers);
    }

    /**
     * 查询回收站负载均衡器列表
     *
     * 查询回收站负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleBinLoadBalancersRequest 请求对象
     * @return SyncInvoker<ListRecycleBinLoadBalancersRequest, ListRecycleBinLoadBalancersResponse>
     */
    public SyncInvoker<ListRecycleBinLoadBalancersRequest, ListRecycleBinLoadBalancersResponse> listRecycleBinLoadBalancersInvoker(
        ListRecycleBinLoadBalancersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listRecycleBinLoadBalancers, hcClient);
    }

    /**
     * 查询自定义安全策略列表
     *
     * 查询自定义安全策略列表。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPoliciesRequest 请求对象
     * @return ListSecurityPoliciesResponse
     */
    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listSecurityPolicies);
    }

    /**
     * 查询自定义安全策略列表
     *
     * 查询自定义安全策略列表。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPoliciesRequest 请求对象
     * @return SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
     */
    public SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPoliciesInvoker(
        ListSecurityPoliciesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listSecurityPolicies, hcClient);
    }

    /**
     * 查询系统安全策略列表
     *
     * 查询系统安全策略列表。
     * 
     * 系统安全策略为预置的所有租户通用的安全策略，租户不可新增或修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemSecurityPoliciesRequest 请求对象
     * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listSystemSecurityPolicies);
    }

    /**
     * 查询系统安全策略列表
     *
     * 查询系统安全策略列表。
     * 
     * 系统安全策略为预置的所有租户通用的安全策略，租户不可新增或修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemSecurityPoliciesRequest 请求对象
     * @return SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse>
     */
    public SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesInvoker(
        ListSystemSecurityPoliciesRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listSystemSecurityPolicies, hcClient);
    }

    /**
     * 还原负载均衡器
     *
     * 从回收站中还原负载均衡器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreLoadbalancerRequest 请求对象
     * @return RestoreLoadbalancerResponse
     */
    public RestoreLoadbalancerResponse restoreLoadbalancer(RestoreLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.restoreLoadbalancer);
    }

    /**
     * 还原负载均衡器
     *
     * 从回收站中还原负载均衡器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreLoadbalancerRequest 请求对象
     * @return SyncInvoker<RestoreLoadbalancerRequest, RestoreLoadbalancerResponse>
     */
    public SyncInvoker<RestoreLoadbalancerRequest, RestoreLoadbalancerResponse> restoreLoadbalancerInvoker(
        RestoreLoadbalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.restoreLoadbalancer, hcClient);
    }

    /**
     * 查询证书详情
     *
     * 查询ELB证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询证书详情
     *
     * 查询ELB证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showCertificate, hcClient);
    }

    /**
     * 查询证书私钥字段回显开关
     *
     * 查询证书私钥回显开关的状态。该开关用于设置各个ELB证书接口的响应字段private_key和enc_private_key是否展示。若开启则这些接口返回私钥内容；不开启则返回脱敏后内容（******）。该开关影响整个租户项目（project），默认开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatePrivateKeyEchoRequest 请求对象
     * @return ShowCertificatePrivateKeyEchoResponse
     */
    public ShowCertificatePrivateKeyEchoResponse showCertificatePrivateKeyEcho(
        ShowCertificatePrivateKeyEchoRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificatePrivateKeyEcho);
    }

    /**
     * 查询证书私钥字段回显开关
     *
     * 查询证书私钥回显开关的状态。该开关用于设置各个ELB证书接口的响应字段private_key和enc_private_key是否展示。若开启则这些接口返回私钥内容；不开启则返回脱敏后内容（******）。该开关影响整个租户项目（project），默认开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatePrivateKeyEchoRequest 请求对象
     * @return SyncInvoker<ShowCertificatePrivateKeyEchoRequest, ShowCertificatePrivateKeyEchoResponse>
     */
    public SyncInvoker<ShowCertificatePrivateKeyEchoRequest, ShowCertificatePrivateKeyEchoResponse> showCertificatePrivateKeyEchoInvoker(
        ShowCertificatePrivateKeyEchoRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showCertificatePrivateKeyEcho, hcClient);
    }

    /**
     * 查询规格详情
     *
     * 查询规格的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorRequest 请求对象
     * @return ShowFlavorResponse
     */
    public ShowFlavorResponse showFlavor(ShowFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showFlavor);
    }

    /**
     * 查询规格详情
     *
     * 查询规格的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorRequest 请求对象
     * @return SyncInvoker<ShowFlavorRequest, ShowFlavorResponse>
     */
    public SyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorInvoker(ShowFlavorRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showFlavor, hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthMonitorRequest 请求对象
     * @return ShowHealthMonitorResponse
     */
    public ShowHealthMonitorResponse showHealthMonitor(ShowHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthMonitorRequest 请求对象
     * @return SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>
     */
    public SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorInvoker(
        ShowHealthMonitorRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showHealthMonitor, hcClient);
    }

    /**
     * 查询异步任务的job状态
     *
     * 用于查询实例复制、实例升级等异步接口任务的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showJob);
    }

    /**
     * 查询异步任务的job状态
     *
     * 用于查询实例复制、实例升级等异步接口任务的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showJob, hcClient);
    }

    /**
     * 查询转发策略详情
     *
     * 查询七层转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7PolicyRequest 请求对象
     * @return ShowL7PolicyResponse
     */
    public ShowL7PolicyResponse showL7Policy(ShowL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    /**
     * 查询转发策略详情
     *
     * 查询七层转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7PolicyRequest 请求对象
     * @return SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>
     */
    public SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyInvoker(ShowL7PolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showL7Policy, hcClient);
    }

    /**
     * 查询转发规则详情
     *
     * 查询七层转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7RuleRequest 请求对象
     * @return ShowL7RuleResponse
     */
    public ShowL7RuleResponse showL7Rule(ShowL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    /**
     * 查询转发规则详情
     *
     * 查询七层转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7RuleRequest 请求对象
     * @return SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>
     */
    public SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleInvoker(ShowL7RuleRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showL7Rule, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return SyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showListener, hcClient);
    }

    /**
     * 查询负载均衡器详情
     *
     * 查询负载均衡器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerRequest 请求对象
     * @return ShowLoadBalancerResponse
     */
    public ShowLoadBalancerResponse showLoadBalancer(ShowLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    /**
     * 查询负载均衡器详情
     *
     * 查询负载均衡器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>
     */
    public SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerInvoker(
        ShowLoadBalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showLoadBalancer, hcClient);
    }

    /**
     * 查询负载均衡器占用的下联面子网端口列表
     *
     * 查询负载均衡器占用的下联面子网端口和IP地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerPortsRequest 请求对象
     * @return ShowLoadBalancerPortsResponse
     */
    public ShowLoadBalancerPortsResponse showLoadBalancerPorts(ShowLoadBalancerPortsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancerPorts);
    }

    /**
     * 查询负载均衡器占用的下联面子网端口列表
     *
     * 查询负载均衡器占用的下联面子网端口和IP地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerPortsRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerPortsRequest, ShowLoadBalancerPortsResponse>
     */
    public SyncInvoker<ShowLoadBalancerPortsRequest, ShowLoadBalancerPortsResponse> showLoadBalancerPortsInvoker(
        ShowLoadBalancerPortsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showLoadBalancerPorts, hcClient);
    }

    /**
     * 查询负载均衡器状态树
     *
     * 查询负载均衡器状态树，包括负载均衡器及其关联的子资源的状态信息。
     * 注意：该接口中的operating_status不一定与对应资源的operating_status相同。
     * 如：当Member的admin_state_up&#x3D;false且operating_status&#x3D;OFFLINE时，
     * 该接口返回member的operating_status&#x3D;DISABLE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerStatusRequest 请求对象
     * @return ShowLoadBalancerStatusResponse
     */
    public ShowLoadBalancerStatusResponse showLoadBalancerStatus(ShowLoadBalancerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    /**
     * 查询负载均衡器状态树
     *
     * 查询负载均衡器状态树，包括负载均衡器及其关联的子资源的状态信息。
     * 注意：该接口中的operating_status不一定与对应资源的operating_status相同。
     * 如：当Member的admin_state_up&#x3D;false且operating_status&#x3D;OFFLINE时，
     * 该接口返回member的operating_status&#x3D;DISABLE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerStatusRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>
     */
    public SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusInvoker(
        ShowLoadBalancerStatusRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showLoadBalancerStatus, hcClient);
    }

    /**
     * 查询云日志详情
     *
     * 云日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogtankRequest 请求对象
     * @return ShowLogtankResponse
     */
    public ShowLogtankResponse showLogtank(ShowLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLogtank);
    }

    /**
     * 查询云日志详情
     *
     * 云日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogtankRequest 请求对象
     * @return SyncInvoker<ShowLogtankRequest, ShowLogtankResponse>
     */
    public SyncInvoker<ShowLogtankRequest, ShowLogtankResponse> showLogtankInvoker(ShowLogtankRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showLogtank, hcClient);
    }

    /**
     * 查询主备后端服务器组详情
     *
     * 主备后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterSlavePoolRequest 请求对象
     * @return ShowMasterSlavePoolResponse
     */
    public ShowMasterSlavePoolResponse showMasterSlavePool(ShowMasterSlavePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMasterSlavePool);
    }

    /**
     * 查询主备后端服务器组详情
     *
     * 主备后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterSlavePoolRequest 请求对象
     * @return SyncInvoker<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse>
     */
    public SyncInvoker<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse> showMasterSlavePoolInvoker(
        ShowMasterSlavePoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showMasterSlavePool, hcClient);
    }

    /**
     * 查询后端服务器详情
     *
     * 后端服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberRequest 请求对象
     * @return ShowMemberResponse
     */
    public ShowMemberResponse showMember(ShowMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端服务器详情
     *
     * 后端服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberRequest 请求对象
     * @return SyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public SyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberInvoker(ShowMemberRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showMember, hcClient);
    }

    /**
     * 查询后端服务器检测任务的结果
     *
     * 查询后端服务器检测任务的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberHealthCheckJobRequest 请求对象
     * @return ShowMemberHealthCheckJobResponse
     */
    public ShowMemberHealthCheckJobResponse showMemberHealthCheckJob(ShowMemberHealthCheckJobRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMemberHealthCheckJob);
    }

    /**
     * 查询后端服务器检测任务的结果
     *
     * 查询后端服务器检测任务的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberHealthCheckJobRequest 请求对象
     * @return SyncInvoker<ShowMemberHealthCheckJobRequest, ShowMemberHealthCheckJobResponse>
     */
    public SyncInvoker<ShowMemberHealthCheckJobRequest, ShowMemberHealthCheckJobResponse> showMemberHealthCheckJobInvoker(
        ShowMemberHealthCheckJobRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showMemberHealthCheckJob, hcClient);
    }

    /**
     * 查询后端服务器组详情
     *
     * 后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询后端服务器组详情
     *
     * 后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showPool, hcClient);
    }

    /**
     * 查询配额详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额。接口返回只包含总配额，不包含已使用配额。若需要查询已使用配额，可使用查询配额使用详情（GET /v3/{project_id}/elb/quotas/details）接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showQuota);
    }

    /**
     * 查询配额详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额。接口返回只包含总配额，不包含已使用配额。若需要查询已使用配额，可使用查询配额使用详情（GET /v3/{project_id}/elb/quotas/details）接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showQuota, hcClient);
    }

    /**
     * 查询回收站的配置
     *
     * 查询回收站的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleBinRequest 请求对象
     * @return ShowRecycleBinResponse
     */
    public ShowRecycleBinResponse showRecycleBin(ShowRecycleBinRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showRecycleBin);
    }

    /**
     * 查询回收站的配置
     *
     * 查询回收站的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleBinRequest 请求对象
     * @return SyncInvoker<ShowRecycleBinRequest, ShowRecycleBinResponse>
     */
    public SyncInvoker<ShowRecycleBinRequest, ShowRecycleBinResponse> showRecycleBinInvoker(
        ShowRecycleBinRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showRecycleBin, hcClient);
    }

    /**
     * 查询自定义安全策略详情
     *
     * 查询自定义安全策略详情。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPolicyRequest 请求对象
     * @return ShowSecurityPolicyResponse
     */
    public ShowSecurityPolicyResponse showSecurityPolicy(ShowSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showSecurityPolicy);
    }

    /**
     * 查询自定义安全策略详情
     *
     * 查询自定义安全策略详情。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPolicyRequest 请求对象
     * @return SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse>
     */
    public SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicyInvoker(
        ShowSecurityPolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showSecurityPolicy, hcClient);
    }

    /**
     * 更新证书
     *
     * 更新ELB证书。不能更新证书类型，但可以更新证书内容和私钥等。
     * 注意：更新证书会影响当前证书已关联的监听器，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新证书
     *
     * 更新ELB证书。不能更新证书类型，但可以更新证书内容和私钥等。
     * 注意：更新证书会影响当前证书已关联的监听器，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateCertificate, hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthMonitorRequest 请求对象
     * @return UpdateHealthMonitorResponse
     */
    public UpdateHealthMonitorResponse updateHealthMonitor(UpdateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthMonitorRequest 请求对象
     * @return SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>
     */
    public SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorInvoker(
        UpdateHealthMonitorRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateHealthMonitor, hcClient);
    }

    /**
     * 更新转发策略
     *
     * 更新七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7PolicyRequest 请求对象
     * @return UpdateL7PolicyResponse
     */
    public UpdateL7PolicyResponse updateL7Policy(UpdateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    /**
     * 更新转发策略
     *
     * 更新七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7PolicyRequest 请求对象
     * @return SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>
     */
    public SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyInvoker(
        UpdateL7PolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateL7Policy, hcClient);
    }

    /**
     * 更新转发规则
     *
     * 更新七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7RuleRequest 请求对象
     * @return UpdateL7RuleResponse
     */
    public UpdateL7RuleResponse updateL7Rule(UpdateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    /**
     * 更新转发规则
     *
     * 更新七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7RuleRequest 请求对象
     * @return SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>
     */
    public SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleInvoker(UpdateL7RuleRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateL7Rule, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(
        UpdateListenerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateListener, hcClient);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoadBalancerRequest 请求对象
     * @return UpdateLoadBalancerResponse
     */
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoadBalancerRequest 请求对象
     * @return SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
     */
    public SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerInvoker(
        UpdateLoadBalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateLoadBalancer, hcClient);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return UpdateLogtankResponse
     */
    public UpdateLogtankResponse updateLogtank(UpdateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLogtank);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>
     */
    public SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankInvoker(UpdateLogtankRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateLogtank, hcClient);
    }

    /**
     * 更新后端服务器
     *
     * 更新后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端服务器
     *
     * 更新后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateMember, hcClient);
    }

    /**
     * 更新后端服务器组
     *
     * 更新后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoolRequest 请求对象
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新后端服务器组
     *
     * 更新后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoolRequest 请求对象
     * @return SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public SyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolInvoker(UpdatePoolRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updatePool, hcClient);
    }

    /**
     * 开关回收站
     *
     * 开启或关闭回收站功能。开启后删除的LB可以进入回收站，否则将不进入回收站而是直接被删除无法恢复。关闭回收站前需要先将回收站中的实例还原或销毁。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinEnableRequest 请求对象
     * @return UpdateRecycleBinEnableResponse
     */
    public UpdateRecycleBinEnableResponse updateRecycleBinEnable(UpdateRecycleBinEnableRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateRecycleBinEnable);
    }

    /**
     * 开关回收站
     *
     * 开启或关闭回收站功能。开启后删除的LB可以进入回收站，否则将不进入回收站而是直接被删除无法恢复。关闭回收站前需要先将回收站中的实例还原或销毁。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinEnableRequest 请求对象
     * @return SyncInvoker<UpdateRecycleBinEnableRequest, UpdateRecycleBinEnableResponse>
     */
    public SyncInvoker<UpdateRecycleBinEnableRequest, UpdateRecycleBinEnableResponse> updateRecycleBinEnableInvoker(
        UpdateRecycleBinEnableRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateRecycleBinEnable, hcClient);
    }

    /**
     * 更新回收站的配置
     *
     * 更新回收站的配置。若回收站未开启，则更新会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinPolicyRequest 请求对象
     * @return UpdateRecycleBinPolicyResponse
     */
    public UpdateRecycleBinPolicyResponse updateRecycleBinPolicy(UpdateRecycleBinPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateRecycleBinPolicy);
    }

    /**
     * 更新回收站的配置
     *
     * 更新回收站的配置。若回收站未开启，则更新会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinPolicyRequest 请求对象
     * @return SyncInvoker<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse>
     */
    public SyncInvoker<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse> updateRecycleBinPolicyInvoker(
        UpdateRecycleBinPolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateRecycleBinPolicy, hcClient);
    }

    /**
     * 更新自定义安全策略
     *
     * 更新自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPolicyRequest 请求对象
     * @return UpdateSecurityPolicyResponse
     */
    public UpdateSecurityPolicyResponse updateSecurityPolicy(UpdateSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateSecurityPolicy);
    }

    /**
     * 更新自定义安全策略
     *
     * 更新自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPolicyRequest 请求对象
     * @return SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>
     */
    public SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicyInvoker(
        UpdateSecurityPolicyRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateSecurityPolicy, hcClient);
    }

    /**
     * 升级负载均衡器类型
     *
     * 升级负载均衡器类型。支持将共享型ELB升级为独享型ELB，但不支持独享型降级为共享型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeLoadbalancerRequest 请求对象
     * @return UpgradeLoadbalancerResponse
     */
    public UpgradeLoadbalancerResponse upgradeLoadbalancer(UpgradeLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.upgradeLoadbalancer);
    }

    /**
     * 升级负载均衡器类型
     *
     * 升级负载均衡器类型。支持将共享型ELB升级为独享型ELB，但不支持独享型降级为共享型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeLoadbalancerRequest 请求对象
     * @return SyncInvoker<UpgradeLoadbalancerRequest, UpgradeLoadbalancerResponse>
     */
    public SyncInvoker<UpgradeLoadbalancerRequest, UpgradeLoadbalancerResponse> upgradeLoadbalancerInvoker(
        UpgradeLoadbalancerRequest request) {
        return new SyncInvoker<>(request, ElbMeta.upgradeLoadbalancer, hcClient);
    }

    /**
     * 查询API版本列表信息
     *
     * 查询当前ELB服务所有可用的API版本。通常情况下高版本API（当前v3为最高版本）比低版本API支持更多更全的特性。
     * 不同版本接口使用时需要注意如下事项：
     * - 创建负载均衡器（POST /v3/{project_id}/elb/loadbalancers）接口无法创建共享型ELB实例。需要通过v2/v2.0接口创建，或者通过批量创建负载均衡器（/v3/{project_id}/elb/loadbalancers/batch-create）、复制已有负载均衡器（/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/clone）这两个接口创建。
     * - 其他v3接口都可以同时处理独享型和共享型实例及其子资源。例如：可以使用创建监听器接口（POST /v3/{project_id}/elb/listeners）创建共享型ELB下的监听器。但在这种情况下部分独享型实例特有的特性将不会支持，具体见各API说明。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listApiVersions);
    }

    /**
     * 查询API版本列表信息
     *
     * 查询当前ELB服务所有可用的API版本。通常情况下高版本API（当前v3为最高版本）比低版本API支持更多更全的特性。
     * 不同版本接口使用时需要注意如下事项：
     * - 创建负载均衡器（POST /v3/{project_id}/elb/loadbalancers）接口无法创建共享型ELB实例。需要通过v2/v2.0接口创建，或者通过批量创建负载均衡器（/v3/{project_id}/elb/loadbalancers/batch-create）、复制已有负载均衡器（/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/clone）这两个接口创建。
     * - 其他v3接口都可以同时处理独享型和共享型实例及其子资源。例如：可以使用创建监听器接口（POST /v3/{project_id}/elb/listeners）创建共享型ELB下的监听器。但在这种情况下部分独享型实例特有的特性将不会支持，具体见各API说明。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listApiVersions, hcClient);
    }

    /**
     * 删除IP地址组的IP列表项
     *
     * 批量删除IP地址组中IP列表的IP地址项。
     * 注意：删除IP列表的IP地址项会影响所有已关联的监听器，请谨慎操作。
     * [荷兰region不支持该API](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIpListRequest 请求对象
     * @return BatchDeleteIpListResponse
     */
    public BatchDeleteIpListResponse batchDeleteIpList(BatchDeleteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteIpList);
    }

    /**
     * 删除IP地址组的IP列表项
     *
     * 批量删除IP地址组中IP列表的IP地址项。
     * 注意：删除IP列表的IP地址项会影响所有已关联的监听器，请谨慎操作。
     * [荷兰region不支持该API](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIpListRequest 请求对象
     * @return SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse>
     */
    public SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse> batchDeleteIpListInvoker(
        BatchDeleteIpListRequest request) {
        return new SyncInvoker<>(request, ElbMeta.batchDeleteIpList, hcClient);
    }

    /**
     * 计算预占IP数
     *
     * 计算以下几种场景的预占用IP数量：
     * 
     * - 计算创建LB所需IP数量：传入字段availability_zone_id，及可选字段l7_flavor_id、ip_target_enable、ip_version，不能传loadbalancer_id。
     * - 计算创建LB的第一个七层监听器后新增占用IP数量：传入loadbalancer_id，其他字段不传。
     * - 计算LB变更（规格变更或特性开启）新增占用IP数量：传入字段loadbalancer_id，及l7_flavor_id不为空或ip_target_enable为true。可以同时传入多个字段，表示同时进行多种变更所需要新增的占用IP数量。
     * - 计算共享型ELB升级为独享型ELB所需新增占用IP数量：传入sence、loadbalancer_id，其他字段不传。
     * - 计算ELB实例开启NAT64特性所需新增占用IP数量：传入nat64_enable、loadbalancer_id，其他字段不传。
     * 
     * 注意：
     * - 计算出来的预占IP数大于等于最终实际占用的IP数。
     * - 只计算新增占用IP数量，不包含已占用的IP数。
     * 
     * [不支持传入l7_flavor_id。](tag:hcso,hk_vdf,srg,fcs)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPreoccupyIpNumRequest 请求对象
     * @return CountPreoccupyIpNumResponse
     */
    public CountPreoccupyIpNumResponse countPreoccupyIpNum(CountPreoccupyIpNumRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    /**
     * 计算预占IP数
     *
     * 计算以下几种场景的预占用IP数量：
     * 
     * - 计算创建LB所需IP数量：传入字段availability_zone_id，及可选字段l7_flavor_id、ip_target_enable、ip_version，不能传loadbalancer_id。
     * - 计算创建LB的第一个七层监听器后新增占用IP数量：传入loadbalancer_id，其他字段不传。
     * - 计算LB变更（规格变更或特性开启）新增占用IP数量：传入字段loadbalancer_id，及l7_flavor_id不为空或ip_target_enable为true。可以同时传入多个字段，表示同时进行多种变更所需要新增的占用IP数量。
     * - 计算共享型ELB升级为独享型ELB所需新增占用IP数量：传入sence、loadbalancer_id，其他字段不传。
     * - 计算ELB实例开启NAT64特性所需新增占用IP数量：传入nat64_enable、loadbalancer_id，其他字段不传。
     * 
     * 注意：
     * - 计算出来的预占IP数大于等于最终实际占用的IP数。
     * - 只计算新增占用IP数量，不包含已占用的IP数。
     * 
     * [不支持传入l7_flavor_id。](tag:hcso,hk_vdf,srg,fcs)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPreoccupyIpNumRequest 请求对象
     * @return SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>
     */
    public SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumInvoker(
        CountPreoccupyIpNumRequest request) {
        return new SyncInvoker<>(request, ElbMeta.countPreoccupyIpNum, hcClient);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。IP地址组用于关联监听器，设置监听器访问控制，指定可以访问或者禁止访问监听器的IP地址。
     * 支持IPv4和IPv6类型地址，可以设置单个IP地址、IP地址段和连续IP地址范围。IP地址范围的格式为ip-ip，例如10.12.3.1-10.12.3.10。
     * 
     * 注意：0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。IP地址组用于关联监听器，设置监听器访问控制，指定可以访问或者禁止访问监听器的IP地址。
     * 支持IPv4和IPv6类型地址，可以设置单个IP地址、IP地址段和连续IP地址范围。IP地址范围的格式为ip-ip，例如10.12.3.1-10.12.3.10。
     * 
     * 注意：0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<>(request, ElbMeta.createIpGroup, hcClient);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组。已关联监听器的IP地址组无法直接删除，需要先解除关联关系。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return DeleteIpGroupResponse
     */
    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组。已关联监听器的IP地址组无法直接删除，需要先解除关联关系。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<>(request, ElbMeta.deleteIpGroup, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return ListIpGroupsResponse
     */
    public ListIpGroupsResponse listIpGroups(ListIpGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsInvoker(ListIpGroupsRequest request) {
        return new SyncInvoker<>(request, ElbMeta.listIpGroups, hcClient);
    }

    /**
     * 查询IP地址组详情
     *
     * 获取IP地址组详情。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    /**
     * 查询IP地址组详情
     *
     * 获取IP地址组详情。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showIpGroup, hcClient);
    }

    /**
     * 查询IP地址组关联的监听器列表
     *
     * 查询IP地址组关联的监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRelatedListenersRequest 请求对象
     * @return ShowIpGroupRelatedListenersResponse
     */
    public ShowIpGroupRelatedListenersResponse showIpGroupRelatedListeners(ShowIpGroupRelatedListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showIpGroupRelatedListeners);
    }

    /**
     * 查询IP地址组关联的监听器列表
     *
     * 查询IP地址组关联的监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRelatedListenersRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRelatedListenersRequest, ShowIpGroupRelatedListenersResponse>
     */
    public SyncInvoker<ShowIpGroupRelatedListenersRequest, ShowIpGroupRelatedListenersResponse> showIpGroupRelatedListenersInvoker(
        ShowIpGroupRelatedListenersRequest request) {
        return new SyncInvoker<>(request, ElbMeta.showIpGroupRelatedListeners, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组。若要更新其中的IP地址列表，则只支持全量更新。即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。
     * 支持IPv4和IPv6类型地址，可以设置单个IP地址、IP地址段和连续IP地址范围。IP地址范围的格式为ip-ip，例如10.12.3.1-10.12.3.10。
     * 
     * 注意：
     * - 0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * - 更新IP地址组中的ip_list会影响所有已关联的监听器，请谨慎操作。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return UpdateIpGroupResponse
     */
    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组。若要更新其中的IP地址列表，则只支持全量更新。即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。
     * 支持IPv4和IPv6类型地址，可以设置单个IP地址、IP地址段和连续IP地址范围。IP地址范围的格式为ip-ip，例如10.12.3.1-10.12.3.10。
     * 
     * 注意：
     * - 0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * - 更新IP地址组中的ip_list会影响所有已关联的监听器，请谨慎操作。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateIpGroup, hcClient);
    }

    /**
     * 更新IP地址组的IP列表项
     *
     * 添加新的IP地址到IP地址组的IP列表中，或更新已有IP地址的描述。不支持通过该接口删除ip_list中已有的IP地址。
     * 注意：
     * - 0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * - 更新IP地址组中的ip_list会影响所有已关联的监听器，请谨慎操作。
     * 
     * [荷兰region不支持该API](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpListRequest 请求对象
     * @return UpdateIpListResponse
     */
    public UpdateIpListResponse updateIpList(UpdateIpListRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpList);
    }

    /**
     * 更新IP地址组的IP列表项
     *
     * 添加新的IP地址到IP地址组的IP列表中，或更新已有IP地址的描述。不支持通过该接口删除ip_list中已有的IP地址。
     * 注意：
     * - 0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * - 更新IP地址组中的ip_list会影响所有已关联的监听器，请谨慎操作。
     * 
     * [荷兰region不支持该API](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpListRequest 请求对象
     * @return SyncInvoker<UpdateIpListRequest, UpdateIpListResponse>
     */
    public SyncInvoker<UpdateIpListRequest, UpdateIpListResponse> updateIpListInvoker(UpdateIpListRequest request) {
        return new SyncInvoker<>(request, ElbMeta.updateIpList, hcClient);
    }

}
