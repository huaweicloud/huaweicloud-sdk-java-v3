package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dns.v2.model.AssociateHealthCheckRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateHealthCheckResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateHealthCheckRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateHealthCheckResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ListCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ListLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListNameServersRequest;
import com.huaweicloud.sdk.dns.v2.model.ListNameServersResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPrivateZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPrivateZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPtrRecordsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPtrRecordsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsByZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsByZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowApiInfoRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowApiInfoResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneNameServerResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneNameServerResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetByZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetByZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsResponse;

public class DnsClient {

    protected HcClient hcClient;

    public DnsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DnsClient> newBuilder() {
        ClientBuilder<DnsClient> clientBuilder = new ClientBuilder<>(DnsClient::new);
        return clientBuilder;
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return CreateCustomLineResponse
     */
    public CreateCustomLineResponse createCustomLine(CreateCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createCustomLine);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>
     */
    public SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLineInvoker(
        CreateCustomLineRequest request) {
        return new SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>(request, DnsMeta.createCustomLine,
            hcClient);
    }

    /**
     * 创建线路分组
     *
     * 创建一个线路分组。 该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return CreateLineGroupResponse
     */
    public CreateLineGroupResponse createLineGroup(CreateLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createLineGroup);
    }

    /**
     * 创建线路分组
     *
     * 创建一个线路分组。 该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>
     */
    public SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroupInvoker(
        CreateLineGroupRequest request) {
        return new SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>(request, DnsMeta.createLineGroup,
            hcClient);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return DeleteCustomLineResponse
     */
    public DeleteCustomLineResponse deleteCustomLine(DeleteCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteCustomLine);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>
     */
    public SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLineInvoker(
        DeleteCustomLineRequest request) {
        return new SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>(request, DnsMeta.deleteCustomLine,
            hcClient);
    }

    /**
     * 删除线路分组
     *
     * 删除单个线路分组。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return DeleteLineGroupResponse
     */
    public DeleteLineGroupResponse deleteLineGroup(DeleteLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteLineGroup);
    }

    /**
     * 删除线路分组
     *
     * 删除单个线路分组。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>
     */
    public SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroupInvoker(
        DeleteLineGroupRequest request) {
        return new SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>(request, DnsMeta.deleteLineGroup,
            hcClient);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listApiVersions);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DnsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return ListCustomLineResponse
     */
    public ListCustomLineResponse listCustomLine(ListCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listCustomLine);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return SyncInvoker<ListCustomLineRequest, ListCustomLineResponse>
     */
    public SyncInvoker<ListCustomLineRequest, ListCustomLineResponse> listCustomLineInvoker(
        ListCustomLineRequest request) {
        return new SyncInvoker<ListCustomLineRequest, ListCustomLineResponse>(request, DnsMeta.listCustomLine,
            hcClient);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return ListLineGroupsResponse
     */
    public ListLineGroupsResponse listLineGroups(ListLineGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listLineGroups);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>
     */
    public SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroupsInvoker(
        ListLineGroupsRequest request) {
        return new SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>(request, DnsMeta.listLineGroups,
            hcClient);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return ListNameServersResponse
     */
    public ListNameServersResponse listNameServers(ListNameServersRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listNameServers);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return SyncInvoker<ListNameServersRequest, ListNameServersResponse>
     */
    public SyncInvoker<ListNameServersRequest, ListNameServersResponse> listNameServersInvoker(
        ListNameServersRequest request) {
        return new SyncInvoker<ListNameServersRequest, ListNameServersResponse>(request, DnsMeta.listNameServers,
            hcClient);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return ShowApiInfoResponse
     */
    public ShowApiInfoResponse showApiInfo(ShowApiInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showApiInfo);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoInvoker(ShowApiInfoRequest request) {
        return new SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, DnsMeta.showApiInfo, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询单租户在DNS服务下的资源配额，包括公网zone配额、内网zone配额、Record Set配额、PTR Record配额、入站终端节点配额、出站终端节点配额、自定义线路配额、线路分组配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return ShowDomainQuotaResponse
     */
    public ShowDomainQuotaResponse showDomainQuota(ShowDomainQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showDomainQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询单租户在DNS服务下的资源配额，包括公网zone配额、内网zone配额、Record Set配额、PTR Record配额、入站终端节点配额、出站终端节点配额、自定义线路配额、线路分组配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaInvoker(
        ShowDomainQuotaRequest request) {
        return new SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>(request, DnsMeta.showDomainQuota,
            hcClient);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return ShowLineGroupResponse
     */
    public ShowLineGroupResponse showLineGroup(ShowLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showLineGroup);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>
     */
    public SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroupInvoker(ShowLineGroupRequest request) {
        return new SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>(request, DnsMeta.showLineGroup, hcClient);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateCustomLine);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>
     */
    public SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLineInvoker(
        UpdateCustomLineRequest request) {
        return new SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>(request, DnsMeta.updateCustomLine,
            hcClient);
    }

    /**
     * 更新线路分组
     *
     * 更新单个线路分组。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return UpdateLineGroupsResponse
     */
    public UpdateLineGroupsResponse updateLineGroups(UpdateLineGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateLineGroups);
    }

    /**
     * 更新线路分组
     *
     * 更新单个线路分组。该接口部分区域未上线、如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>
     */
    public SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroupsInvoker(
        UpdateLineGroupsRequest request) {
        return new SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>(request, DnsMeta.updateLineGroups,
            hcClient);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return CreateEipRecordSetResponse
     */
    public CreateEipRecordSetResponse createEipRecordSet(CreateEipRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createEipRecordSet);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>
     */
    public SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSetInvoker(
        CreateEipRecordSetRequest request) {
        return new SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>(request,
            DnsMeta.createEipRecordSet, hcClient);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return ListPtrRecordsResponse
     */
    public ListPtrRecordsResponse listPtrRecords(ListPtrRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPtrRecords);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>
     */
    public SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecordsInvoker(
        ListPtrRecordsRequest request) {
        return new SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>(request, DnsMeta.listPtrRecords,
            hcClient);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return RestorePtrRecordResponse
     */
    public RestorePtrRecordResponse restorePtrRecord(RestorePtrRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.restorePtrRecord);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>
     */
    public SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecordInvoker(
        RestorePtrRecordRequest request) {
        return new SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>(request, DnsMeta.restorePtrRecord,
            hcClient);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return ShowPtrRecordSetResponse
     */
    public ShowPtrRecordSetResponse showPtrRecordSet(ShowPtrRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPtrRecordSet);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>
     */
    public SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSetInvoker(
        ShowPtrRecordSetRequest request) {
        return new SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>(request, DnsMeta.showPtrRecordSet,
            hcClient);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return UpdatePtrRecordResponse
     */
    public UpdatePtrRecordResponse updatePtrRecord(UpdatePtrRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePtrRecord);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>
     */
    public SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecordInvoker(
        UpdatePtrRecordRequest request) {
        return new SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>(request, DnsMeta.updatePtrRecord,
            hcClient);
    }

    /**
     * Record Set关联健康检查
     *
     * Record Set关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return AssociateHealthCheckResponse
     */
    public AssociateHealthCheckResponse associateHealthCheck(AssociateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateHealthCheck);
    }

    /**
     * Record Set关联健康检查
     *
     * Record Set关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return SyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>
     */
    public SyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse> associateHealthCheckInvoker(
        AssociateHealthCheckRequest request) {
        return new SyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>(request,
            DnsMeta.associateHealthCheck, hcClient);
    }

    /**
     * 批量删除某个Zone下的Record Set资源
     *
     * 批量删除某个Zone下的Record Set资源，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetWithLineRequest 请求对象
     * @return BatchDeleteRecordSetWithLineResponse
     */
    public BatchDeleteRecordSetWithLineResponse batchDeleteRecordSetWithLine(
        BatchDeleteRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteRecordSetWithLine);
    }

    /**
     * 批量删除某个Zone下的Record Set资源
     *
     * 批量删除某个Zone下的Record Set资源，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>
     */
    public SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineInvoker(
        BatchDeleteRecordSetWithLineRequest request) {
        return new SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>(request,
            DnsMeta.batchDeleteRecordSetWithLine, hcClient);
    }

    /**
     * 批量修改RecordSet
     *
     * 批量修改RecordSet。属于原子性操作，请求Record Set将全部完成修改，或不做任何修改。
     * 仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateRecordSetWithLineRequest 请求对象
     * @return BatchUpdateRecordSetWithLineResponse
     */
    public BatchUpdateRecordSetWithLineResponse batchUpdateRecordSetWithLine(
        BatchUpdateRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchUpdateRecordSetWithLine);
    }

    /**
     * 批量修改RecordSet
     *
     * 批量修改RecordSet。属于原子性操作，请求Record Set将全部完成修改，或不做任何修改。
     * 仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>
     */
    public SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineInvoker(
        BatchUpdateRecordSetWithLineRequest request) {
        return new SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>(request,
            DnsMeta.batchUpdateRecordSetWithLine, hcClient);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return CreateRecordSetResponse
     */
    public CreateRecordSetResponse createRecordSet(CreateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSet);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetInvoker(
        CreateRecordSetRequest request) {
        return new SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>(request, DnsMeta.createRecordSet,
            hcClient);
    }

    /**
     * 批量线路创建RecordSet
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return CreateRecordSetWithBatchLinesResponse
     */
    public CreateRecordSetWithBatchLinesResponse createRecordSetWithBatchLines(
        CreateRecordSetWithBatchLinesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSetWithBatchLines);
    }

    /**
     * 批量线路创建RecordSet
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>
     */
    public SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesInvoker(
        CreateRecordSetWithBatchLinesRequest request) {
        return new SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>(request,
            DnsMeta.createRecordSetWithBatchLines, hcClient);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return CreateRecordSetWithLineResponse
     */
    public CreateRecordSetWithLineResponse createRecordSetWithLine(CreateRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSetWithLine);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>
     */
    public SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLineInvoker(
        CreateRecordSetWithLineRequest request) {
        return new SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>(request,
            DnsMeta.createRecordSetWithLine, hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set. 删除有添加智能解析的记录集时、需要用Record Set多线路管理模块中删除接口进行删除.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return DeleteRecordSetResponse
     */
    public DeleteRecordSetResponse deleteRecordSet(DeleteRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteRecordSet);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set. 删除有添加智能解析的记录集时、需要用Record Set多线路管理模块中删除接口进行删除.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>
     */
    public SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSetInvoker(
        DeleteRecordSetRequest request) {
        return new SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>(request, DnsMeta.deleteRecordSet,
            hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return DeleteRecordSetsResponse
     */
    public DeleteRecordSetsResponse deleteRecordSets(DeleteRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteRecordSets);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>
     */
    public SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSetsInvoker(
        DeleteRecordSetsRequest request) {
        return new SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>(request, DnsMeta.deleteRecordSets,
            hcClient);
    }

    /**
     * Record Set解关联健康检查
     *
     * Record Set解关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return DisassociateHealthCheckResponse
     */
    public DisassociateHealthCheckResponse disassociateHealthCheck(DisassociateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateHealthCheck);
    }

    /**
     * Record Set解关联健康检查
     *
     * Record Set解关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return SyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>
     */
    public SyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> disassociateHealthCheckInvoker(
        DisassociateHealthCheckRequest request) {
        return new SyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>(request,
            DnsMeta.disassociateHealthCheck, hcClient);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return ListRecordSetsResponse
     */
    public ListRecordSetsResponse listRecordSets(ListRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSets);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsInvoker(
        ListRecordSetsRequest request) {
        return new SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>(request, DnsMeta.listRecordSets,
            hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return ListRecordSetsByZoneResponse
     */
    public ListRecordSetsByZoneResponse listRecordSetsByZone(ListRecordSetsByZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSetsByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>
     */
    public SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZoneInvoker(
        ListRecordSetsByZoneRequest request) {
        return new SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>(request,
            DnsMeta.listRecordSetsByZone, hcClient);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return ListRecordSetsWithLineResponse
     */
    public ListRecordSetsWithLineResponse listRecordSetsWithLine(ListRecordSetsWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSetsWithLine);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>
     */
    public SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLineInvoker(
        ListRecordSetsWithLineRequest request) {
        return new SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>(request,
            DnsMeta.listRecordSetsWithLine, hcClient);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return SetRecordSetsStatusResponse
     */
    public SetRecordSetsStatusResponse setRecordSetsStatus(SetRecordSetsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.setRecordSetsStatus);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>
     */
    public SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatusInvoker(
        SetRecordSetsStatusRequest request) {
        return new SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>(request,
            DnsMeta.setRecordSetsStatus, hcClient);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return ShowRecordSetResponse
     */
    public ShowRecordSetResponse showRecordSet(ShowRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSet);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>
     */
    public SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSetInvoker(ShowRecordSetRequest request) {
        return new SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>(request, DnsMeta.showRecordSet, hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return ShowRecordSetByZoneResponse
     */
    public ShowRecordSetByZoneResponse showRecordSetByZone(ShowRecordSetByZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSetByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>
     */
    public SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZoneInvoker(
        ShowRecordSetByZoneRequest request) {
        return new SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>(request,
            DnsMeta.showRecordSetByZone, hcClient);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return ShowRecordSetWithLineResponse
     */
    public ShowRecordSetWithLineResponse showRecordSetWithLine(ShowRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSetWithLine);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>
     */
    public SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLineInvoker(
        ShowRecordSetWithLineRequest request) {
        return new SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>(request,
            DnsMeta.showRecordSetWithLine, hcClient);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return UpdateRecordSetResponse
     */
    public UpdateRecordSetResponse updateRecordSet(UpdateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateRecordSet);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>
     */
    public SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSetInvoker(
        UpdateRecordSetRequest request) {
        return new SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>(request, DnsMeta.updateRecordSet,
            hcClient);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return UpdateRecordSetsResponse
     */
    public UpdateRecordSetsResponse updateRecordSets(UpdateRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateRecordSets);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>
     */
    public SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSetsInvoker(
        UpdateRecordSetsRequest request) {
        return new SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>(request, DnsMeta.updateRecordSets,
            hcClient);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return BatchCreateTagResponse
     */
    public BatchCreateTagResponse batchCreateTag(BatchCreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchCreateTag);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>
     */
    public SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTagInvoker(
        BatchCreateTagRequest request) {
        return new SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>(request, DnsMeta.batchCreateTag,
            hcClient);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createTag);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, DnsMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, DnsMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return ListTagResponse
     */
    public ListTagResponse listTag(ListTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listTag);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return SyncInvoker<ListTagRequest, ListTagResponse>
     */
    public SyncInvoker<ListTagRequest, ListTagResponse> listTagInvoker(ListTagRequest request) {
        return new SyncInvoker<ListTagRequest, ListTagResponse>(request, DnsMeta.listTag, hcClient);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listTags);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, DnsMeta.listTags, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return ShowResourceTagResponse
     */
    public ShowResourceTagResponse showResourceTag(ShowResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showResourceTag);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, DnsMeta.showResourceTag,
            hcClient);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return AssociateRouterResponse
     */
    public AssociateRouterResponse associateRouter(AssociateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateRouter);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return SyncInvoker<AssociateRouterRequest, AssociateRouterResponse>
     */
    public SyncInvoker<AssociateRouterRequest, AssociateRouterResponse> associateRouterInvoker(
        AssociateRouterRequest request) {
        return new SyncInvoker<AssociateRouterRequest, AssociateRouterResponse>(request, DnsMeta.associateRouter,
            hcClient);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return CreatePrivateZoneResponse
     */
    public CreatePrivateZoneResponse createPrivateZone(CreatePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPrivateZone);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>
     */
    public SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZoneInvoker(
        CreatePrivateZoneRequest request) {
        return new SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>(request, DnsMeta.createPrivateZone,
            hcClient);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return CreatePublicZoneResponse
     */
    public CreatePublicZoneResponse createPublicZone(CreatePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPublicZone);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>
     */
    public SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZoneInvoker(
        CreatePublicZoneRequest request) {
        return new SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>(request, DnsMeta.createPublicZone,
            hcClient);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return DeletePrivateZoneResponse
     */
    public DeletePrivateZoneResponse deletePrivateZone(DeletePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePrivateZone);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>
     */
    public SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZoneInvoker(
        DeletePrivateZoneRequest request) {
        return new SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>(request, DnsMeta.deletePrivateZone,
            hcClient);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return DeletePublicZoneResponse
     */
    public DeletePublicZoneResponse deletePublicZone(DeletePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePublicZone);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>
     */
    public SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZoneInvoker(
        DeletePublicZoneRequest request) {
        return new SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>(request, DnsMeta.deletePublicZone,
            hcClient);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return DisassociateRouterResponse
     */
    public DisassociateRouterResponse disassociateRouter(DisassociateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateRouter);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>
     */
    public SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouterInvoker(
        DisassociateRouterRequest request) {
        return new SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>(request,
            DnsMeta.disassociateRouter, hcClient);
    }

    /**
     * 查询内网Zone列表
     *
     * 查询内网Zone列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return ListPrivateZonesResponse
     */
    public ListPrivateZonesResponse listPrivateZones(ListPrivateZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPrivateZones);
    }

    /**
     * 查询内网Zone列表
     *
     * 查询内网Zone列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>
     */
    public SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZonesInvoker(
        ListPrivateZonesRequest request) {
        return new SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>(request, DnsMeta.listPrivateZones,
            hcClient);
    }

    /**
     * 查询公网Zone列表
     *
     * 查询公网Zone列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return ListPublicZonesResponse
     */
    public ListPublicZonesResponse listPublicZones(ListPublicZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPublicZones);
    }

    /**
     * 查询公网Zone列表
     *
     * 查询公网Zone列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>
     */
    public SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZonesInvoker(
        ListPublicZonesRequest request) {
        return new SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>(request, DnsMeta.listPublicZones,
            hcClient);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return ShowPrivateZoneResponse
     */
    public ShowPrivateZoneResponse showPrivateZone(ShowPrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPrivateZone);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>
     */
    public SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZoneInvoker(
        ShowPrivateZoneRequest request) {
        return new SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>(request, DnsMeta.showPrivateZone,
            hcClient);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return ShowPrivateZoneNameServerResponse
     */
    public ShowPrivateZoneNameServerResponse showPrivateZoneNameServer(ShowPrivateZoneNameServerRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPrivateZoneNameServer);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>
     */
    public SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerInvoker(
        ShowPrivateZoneNameServerRequest request) {
        return new SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>(request,
            DnsMeta.showPrivateZoneNameServer, hcClient);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return ShowPublicZoneResponse
     */
    public ShowPublicZoneResponse showPublicZone(ShowPublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPublicZone);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>
     */
    public SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZoneInvoker(
        ShowPublicZoneRequest request) {
        return new SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>(request, DnsMeta.showPublicZone,
            hcClient);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return ShowPublicZoneNameServerResponse
     */
    public ShowPublicZoneNameServerResponse showPublicZoneNameServer(ShowPublicZoneNameServerRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPublicZoneNameServer);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>
     */
    public SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServerInvoker(
        ShowPublicZoneNameServerRequest request) {
        return new SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>(request,
            DnsMeta.showPublicZoneNameServer, hcClient);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return UpdatePrivateZoneResponse
     */
    public UpdatePrivateZoneResponse updatePrivateZone(UpdatePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePrivateZone);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>
     */
    public SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZoneInvoker(
        UpdatePrivateZoneRequest request) {
        return new SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>(request, DnsMeta.updatePrivateZone,
            hcClient);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return UpdatePublicZoneResponse
     */
    public UpdatePublicZoneResponse updatePublicZone(UpdatePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePublicZone);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>
     */
    public SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZoneInvoker(
        UpdatePublicZoneRequest request) {
        return new SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>(request, DnsMeta.updatePublicZone,
            hcClient);
    }

    /**
     * 设置单个公网Zone状态
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return UpdatePublicZoneStatusResponse
     */
    public UpdatePublicZoneStatusResponse updatePublicZoneStatus(UpdatePublicZoneStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePublicZoneStatus);
    }

    /**
     * 设置单个公网Zone状态
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>
     */
    public SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatusInvoker(
        UpdatePublicZoneStatusRequest request) {
        return new SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>(request,
            DnsMeta.updatePublicZoneStatus, hcClient);
    }

}
