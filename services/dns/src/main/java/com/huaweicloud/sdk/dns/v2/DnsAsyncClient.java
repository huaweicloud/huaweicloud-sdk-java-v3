package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dns.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class DnsAsyncClient {

    protected HcClient hcClient;

    public DnsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DnsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DnsAsyncClient::new);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return CompletableFuture<CreateCustomLineResponse>
     */
    public CompletableFuture<CreateCustomLineResponse> createCustomLineAsync(CreateCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createCustomLine);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>
     */
    public AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLineAsyncInvoker(
        CreateCustomLineRequest request) {
        return new AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>(request, DnsMeta.createCustomLine,
            hcClient);
    }

    /**
     * 创建线路分组
     *
     * 创建一个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return CompletableFuture<CreateLineGroupResponse>
     */
    public CompletableFuture<CreateLineGroupResponse> createLineGroupAsync(CreateLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createLineGroup);
    }

    /**
     * 创建线路分组
     *
     * 创建一个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>
     */
    public AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroupAsyncInvoker(
        CreateLineGroupRequest request) {
        return new AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>(request, DnsMeta.createLineGroup,
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
     * @return CompletableFuture<DeleteCustomLineResponse>
     */
    public CompletableFuture<DeleteCustomLineResponse> deleteCustomLineAsync(DeleteCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteCustomLine);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>
     */
    public AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLineAsyncInvoker(
        DeleteCustomLineRequest request) {
        return new AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>(request, DnsMeta.deleteCustomLine,
            hcClient);
    }

    /**
     * 删除线路分组
     *
     * 删除单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return CompletableFuture<DeleteLineGroupResponse>
     */
    public CompletableFuture<DeleteLineGroupResponse> deleteLineGroupAsync(DeleteLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteLineGroup);
    }

    /**
     * 删除线路分组
     *
     * 删除单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>
     */
    public AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroupAsyncInvoker(
        DeleteLineGroupRequest request) {
        return new AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>(request, DnsMeta.deleteLineGroup,
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
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listApiVersions);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DnsMeta.listApiVersions,
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
     * @return CompletableFuture<ListCustomLineResponse>
     */
    public CompletableFuture<ListCustomLineResponse> listCustomLineAsync(ListCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listCustomLine);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse>
     */
    public AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse> listCustomLineAsyncInvoker(
        ListCustomLineRequest request) {
        return new AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse>(request, DnsMeta.listCustomLine,
            hcClient);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return CompletableFuture<ListLineGroupsResponse>
     */
    public CompletableFuture<ListLineGroupsResponse> listLineGroupsAsync(ListLineGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listLineGroups);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>
     */
    public AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroupsAsyncInvoker(
        ListLineGroupsRequest request) {
        return new AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>(request, DnsMeta.listLineGroups,
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
     * @return CompletableFuture<ListNameServersResponse>
     */
    public CompletableFuture<ListNameServersResponse> listNameServersAsync(ListNameServersRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listNameServers);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return AsyncInvoker<ListNameServersRequest, ListNameServersResponse>
     */
    public AsyncInvoker<ListNameServersRequest, ListNameServersResponse> listNameServersAsyncInvoker(
        ListNameServersRequest request) {
        return new AsyncInvoker<ListNameServersRequest, ListNameServersResponse>(request, DnsMeta.listNameServers,
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
     * @return CompletableFuture<ShowApiInfoResponse>
     */
    public CompletableFuture<ShowApiInfoResponse> showApiInfoAsync(ShowApiInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showApiInfo);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoAsyncInvoker(ShowApiInfoRequest request) {
        return new AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, DnsMeta.showApiInfo, hcClient);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return CompletableFuture<ShowLineGroupResponse>
     */
    public CompletableFuture<ShowLineGroupResponse> showLineGroupAsync(ShowLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showLineGroup);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>
     */
    public AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroupAsyncInvoker(
        ShowLineGroupRequest request) {
        return new AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>(request, DnsMeta.showLineGroup, hcClient);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return CompletableFuture<UpdateCustomLineResponse>
     */
    public CompletableFuture<UpdateCustomLineResponse> updateCustomLineAsync(UpdateCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateCustomLine);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>
     */
    public AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLineAsyncInvoker(
        UpdateCustomLineRequest request) {
        return new AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>(request, DnsMeta.updateCustomLine,
            hcClient);
    }

    /**
     * 更新线路分组
     *
     * 更新单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return CompletableFuture<UpdateLineGroupsResponse>
     */
    public CompletableFuture<UpdateLineGroupsResponse> updateLineGroupsAsync(UpdateLineGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateLineGroups);
    }

    /**
     * 更新线路分组
     *
     * 更新单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>
     */
    public AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroupsAsyncInvoker(
        UpdateLineGroupsRequest request) {
        return new AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>(request, DnsMeta.updateLineGroups,
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
     * @return CompletableFuture<CreateEipRecordSetResponse>
     */
    public CompletableFuture<CreateEipRecordSetResponse> createEipRecordSetAsync(CreateEipRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createEipRecordSet);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>
     */
    public AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSetAsyncInvoker(
        CreateEipRecordSetRequest request) {
        return new AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>(request,
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
     * @return CompletableFuture<ListPtrRecordsResponse>
     */
    public CompletableFuture<ListPtrRecordsResponse> listPtrRecordsAsync(ListPtrRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPtrRecords);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>
     */
    public AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecordsAsyncInvoker(
        ListPtrRecordsRequest request) {
        return new AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>(request, DnsMeta.listPtrRecords,
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
     * @return CompletableFuture<RestorePtrRecordResponse>
     */
    public CompletableFuture<RestorePtrRecordResponse> restorePtrRecordAsync(RestorePtrRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.restorePtrRecord);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>
     */
    public AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecordAsyncInvoker(
        RestorePtrRecordRequest request) {
        return new AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>(request, DnsMeta.restorePtrRecord,
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
     * @return CompletableFuture<ShowPtrRecordSetResponse>
     */
    public CompletableFuture<ShowPtrRecordSetResponse> showPtrRecordSetAsync(ShowPtrRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPtrRecordSet);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>
     */
    public AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSetAsyncInvoker(
        ShowPtrRecordSetRequest request) {
        return new AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>(request, DnsMeta.showPtrRecordSet,
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
     * @return CompletableFuture<UpdatePtrRecordResponse>
     */
    public CompletableFuture<UpdatePtrRecordResponse> updatePtrRecordAsync(UpdatePtrRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePtrRecord);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>
     */
    public AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecordAsyncInvoker(
        UpdatePtrRecordRequest request) {
        return new AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>(request, DnsMeta.updatePtrRecord,
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
     * @return CompletableFuture<AssociateHealthCheckResponse>
     */
    public CompletableFuture<AssociateHealthCheckResponse> associateHealthCheckAsync(
        AssociateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateHealthCheck);
    }

    /**
     * Record Set关联健康检查
     *
     * Record Set关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return AsyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>
     */
    public AsyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse> associateHealthCheckAsyncInvoker(
        AssociateHealthCheckRequest request) {
        return new AsyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>(request,
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
     * @return CompletableFuture<BatchDeleteRecordSetWithLineResponse>
     */
    public CompletableFuture<BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineAsync(
        BatchDeleteRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteRecordSetWithLine);
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
     * @return AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>
     */
    public AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineAsyncInvoker(
        BatchDeleteRecordSetWithLineRequest request) {
        return new AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>(request,
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
     * @return CompletableFuture<BatchUpdateRecordSetWithLineResponse>
     */
    public CompletableFuture<BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineAsync(
        BatchUpdateRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchUpdateRecordSetWithLine);
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
     * @return AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>
     */
    public AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineAsyncInvoker(
        BatchUpdateRecordSetWithLineRequest request) {
        return new AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>(request,
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
     * @return CompletableFuture<CreateRecordSetResponse>
     */
    public CompletableFuture<CreateRecordSetResponse> createRecordSetAsync(CreateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSet);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetAsyncInvoker(
        CreateRecordSetRequest request) {
        return new AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>(request, DnsMeta.createRecordSet,
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
     * @return CompletableFuture<CreateRecordSetWithBatchLinesResponse>
     */
    public CompletableFuture<CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesAsync(
        CreateRecordSetWithBatchLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSetWithBatchLines);
    }

    /**
     * 批量线路创建RecordSet
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>
     */
    public AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesAsyncInvoker(
        CreateRecordSetWithBatchLinesRequest request) {
        return new AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>(request,
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
     * @return CompletableFuture<CreateRecordSetWithLineResponse>
     */
    public CompletableFuture<CreateRecordSetWithLineResponse> createRecordSetWithLineAsync(
        CreateRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSetWithLine);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>
     */
    public AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLineAsyncInvoker(
        CreateRecordSetWithLineRequest request) {
        return new AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>(request,
            DnsMeta.createRecordSetWithLine, hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return CompletableFuture<DeleteRecordSetResponse>
     */
    public CompletableFuture<DeleteRecordSetResponse> deleteRecordSetAsync(DeleteRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteRecordSet);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>
     */
    public AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSetAsyncInvoker(
        DeleteRecordSetRequest request) {
        return new AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>(request, DnsMeta.deleteRecordSet,
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
     * @return CompletableFuture<DeleteRecordSetsResponse>
     */
    public CompletableFuture<DeleteRecordSetsResponse> deleteRecordSetsAsync(DeleteRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteRecordSets);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>
     */
    public AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSetsAsyncInvoker(
        DeleteRecordSetsRequest request) {
        return new AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>(request, DnsMeta.deleteRecordSets,
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
     * @return CompletableFuture<DisassociateHealthCheckResponse>
     */
    public CompletableFuture<DisassociateHealthCheckResponse> disassociateHealthCheckAsync(
        DisassociateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateHealthCheck);
    }

    /**
     * Record Set解关联健康检查
     *
     * Record Set解关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return AsyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>
     */
    public AsyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> disassociateHealthCheckAsyncInvoker(
        DisassociateHealthCheckRequest request) {
        return new AsyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>(request,
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
     * @return CompletableFuture<ListRecordSetsResponse>
     */
    public CompletableFuture<ListRecordSetsResponse> listRecordSetsAsync(ListRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSets);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsAsyncInvoker(
        ListRecordSetsRequest request) {
        return new AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>(request, DnsMeta.listRecordSets,
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
     * @return CompletableFuture<ListRecordSetsByZoneResponse>
     */
    public CompletableFuture<ListRecordSetsByZoneResponse> listRecordSetsByZoneAsync(
        ListRecordSetsByZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSetsByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>
     */
    public AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZoneAsyncInvoker(
        ListRecordSetsByZoneRequest request) {
        return new AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>(request,
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
     * @return CompletableFuture<ListRecordSetsWithLineResponse>
     */
    public CompletableFuture<ListRecordSetsWithLineResponse> listRecordSetsWithLineAsync(
        ListRecordSetsWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSetsWithLine);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>
     */
    public AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLineAsyncInvoker(
        ListRecordSetsWithLineRequest request) {
        return new AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>(request,
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
     * @return CompletableFuture<SetRecordSetsStatusResponse>
     */
    public CompletableFuture<SetRecordSetsStatusResponse> setRecordSetsStatusAsync(SetRecordSetsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.setRecordSetsStatus);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>
     */
    public AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatusAsyncInvoker(
        SetRecordSetsStatusRequest request) {
        return new AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>(request,
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
     * @return CompletableFuture<ShowRecordSetResponse>
     */
    public CompletableFuture<ShowRecordSetResponse> showRecordSetAsync(ShowRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSet);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>
     */
    public AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSetAsyncInvoker(
        ShowRecordSetRequest request) {
        return new AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>(request, DnsMeta.showRecordSet, hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return CompletableFuture<ShowRecordSetByZoneResponse>
     */
    public CompletableFuture<ShowRecordSetByZoneResponse> showRecordSetByZoneAsync(ShowRecordSetByZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSetByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>
     */
    public AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZoneAsyncInvoker(
        ShowRecordSetByZoneRequest request) {
        return new AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>(request,
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
     * @return CompletableFuture<ShowRecordSetWithLineResponse>
     */
    public CompletableFuture<ShowRecordSetWithLineResponse> showRecordSetWithLineAsync(
        ShowRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSetWithLine);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>
     */
    public AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLineAsyncInvoker(
        ShowRecordSetWithLineRequest request) {
        return new AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>(request,
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
     * @return CompletableFuture<UpdateRecordSetResponse>
     */
    public CompletableFuture<UpdateRecordSetResponse> updateRecordSetAsync(UpdateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateRecordSet);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>
     */
    public AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSetAsyncInvoker(
        UpdateRecordSetRequest request) {
        return new AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>(request, DnsMeta.updateRecordSet,
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
     * @return CompletableFuture<UpdateRecordSetsResponse>
     */
    public CompletableFuture<UpdateRecordSetsResponse> updateRecordSetsAsync(UpdateRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateRecordSets);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>
     */
    public AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSetsAsyncInvoker(
        UpdateRecordSetsRequest request) {
        return new AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>(request, DnsMeta.updateRecordSets,
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
     * @return CompletableFuture<BatchCreateTagResponse>
     */
    public CompletableFuture<BatchCreateTagResponse> batchCreateTagAsync(BatchCreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchCreateTag);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>
     */
    public AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTagAsyncInvoker(
        BatchCreateTagRequest request) {
        return new AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>(request, DnsMeta.batchCreateTag,
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
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createTag);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, DnsMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, DnsMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return CompletableFuture<ListTagResponse>
     */
    public CompletableFuture<ListTagResponse> listTagAsync(ListTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listTag);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return AsyncInvoker<ListTagRequest, ListTagResponse>
     */
    public AsyncInvoker<ListTagRequest, ListTagResponse> listTagAsyncInvoker(ListTagRequest request) {
        return new AsyncInvoker<ListTagRequest, ListTagResponse>(request, DnsMeta.listTag, hcClient);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listTags);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, DnsMeta.listTags, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return CompletableFuture<ShowResourceTagResponse>
     */
    public CompletableFuture<ShowResourceTagResponse> showResourceTagAsync(ShowResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showResourceTag);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, DnsMeta.showResourceTag,
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
     * @return CompletableFuture<AssociateRouterResponse>
     */
    public CompletableFuture<AssociateRouterResponse> associateRouterAsync(AssociateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateRouter);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse>
     */
    public AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse> associateRouterAsyncInvoker(
        AssociateRouterRequest request) {
        return new AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse>(request, DnsMeta.associateRouter,
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
     * @return CompletableFuture<CreatePrivateZoneResponse>
     */
    public CompletableFuture<CreatePrivateZoneResponse> createPrivateZoneAsync(CreatePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPrivateZone);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>
     */
    public AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZoneAsyncInvoker(
        CreatePrivateZoneRequest request) {
        return new AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>(request, DnsMeta.createPrivateZone,
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
     * @return CompletableFuture<CreatePublicZoneResponse>
     */
    public CompletableFuture<CreatePublicZoneResponse> createPublicZoneAsync(CreatePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPublicZone);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>
     */
    public AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZoneAsyncInvoker(
        CreatePublicZoneRequest request) {
        return new AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>(request, DnsMeta.createPublicZone,
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
     * @return CompletableFuture<DeletePrivateZoneResponse>
     */
    public CompletableFuture<DeletePrivateZoneResponse> deletePrivateZoneAsync(DeletePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePrivateZone);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>
     */
    public AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZoneAsyncInvoker(
        DeletePrivateZoneRequest request) {
        return new AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>(request, DnsMeta.deletePrivateZone,
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
     * @return CompletableFuture<DeletePublicZoneResponse>
     */
    public CompletableFuture<DeletePublicZoneResponse> deletePublicZoneAsync(DeletePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePublicZone);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>
     */
    public AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZoneAsyncInvoker(
        DeletePublicZoneRequest request) {
        return new AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>(request, DnsMeta.deletePublicZone,
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
     * @return CompletableFuture<DisassociateRouterResponse>
     */
    public CompletableFuture<DisassociateRouterResponse> disassociateRouterAsync(DisassociateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateRouter);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>
     */
    public AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouterAsyncInvoker(
        DisassociateRouterRequest request) {
        return new AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>(request,
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
     * @return CompletableFuture<ListPrivateZonesResponse>
     */
    public CompletableFuture<ListPrivateZonesResponse> listPrivateZonesAsync(ListPrivateZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPrivateZones);
    }

    /**
     * 查询内网Zone列表
     *
     * 查询内网Zone列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>
     */
    public AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZonesAsyncInvoker(
        ListPrivateZonesRequest request) {
        return new AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>(request, DnsMeta.listPrivateZones,
            hcClient);
    }

    /**
     * 查询公网Zone的列表
     *
     * 查询公网Zone的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return CompletableFuture<ListPublicZonesResponse>
     */
    public CompletableFuture<ListPublicZonesResponse> listPublicZonesAsync(ListPublicZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPublicZones);
    }

    /**
     * 查询公网Zone的列表
     *
     * 查询公网Zone的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>
     */
    public AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZonesAsyncInvoker(
        ListPublicZonesRequest request) {
        return new AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>(request, DnsMeta.listPublicZones,
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
     * @return CompletableFuture<ShowPrivateZoneResponse>
     */
    public CompletableFuture<ShowPrivateZoneResponse> showPrivateZoneAsync(ShowPrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPrivateZone);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>
     */
    public AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZoneAsyncInvoker(
        ShowPrivateZoneRequest request) {
        return new AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>(request, DnsMeta.showPrivateZone,
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
     * @return CompletableFuture<ShowPrivateZoneNameServerResponse>
     */
    public CompletableFuture<ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerAsync(
        ShowPrivateZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPrivateZoneNameServer);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>
     */
    public AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerAsyncInvoker(
        ShowPrivateZoneNameServerRequest request) {
        return new AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>(request,
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
     * @return CompletableFuture<ShowPublicZoneResponse>
     */
    public CompletableFuture<ShowPublicZoneResponse> showPublicZoneAsync(ShowPublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPublicZone);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>
     */
    public AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZoneAsyncInvoker(
        ShowPublicZoneRequest request) {
        return new AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>(request, DnsMeta.showPublicZone,
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
     * @return CompletableFuture<ShowPublicZoneNameServerResponse>
     */
    public CompletableFuture<ShowPublicZoneNameServerResponse> showPublicZoneNameServerAsync(
        ShowPublicZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPublicZoneNameServer);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>
     */
    public AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServerAsyncInvoker(
        ShowPublicZoneNameServerRequest request) {
        return new AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>(request,
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
     * @return CompletableFuture<UpdatePrivateZoneResponse>
     */
    public CompletableFuture<UpdatePrivateZoneResponse> updatePrivateZoneAsync(UpdatePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePrivateZone);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>
     */
    public AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZoneAsyncInvoker(
        UpdatePrivateZoneRequest request) {
        return new AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>(request, DnsMeta.updatePrivateZone,
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
     * @return CompletableFuture<UpdatePublicZoneResponse>
     */
    public CompletableFuture<UpdatePublicZoneResponse> updatePublicZoneAsync(UpdatePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePublicZone);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>
     */
    public AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZoneAsyncInvoker(
        UpdatePublicZoneRequest request) {
        return new AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>(request, DnsMeta.updatePublicZone,
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
     * @return CompletableFuture<UpdatePublicZoneStatusResponse>
     */
    public CompletableFuture<UpdatePublicZoneStatusResponse> updatePublicZoneStatusAsync(
        UpdatePublicZoneStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePublicZoneStatus);
    }

    /**
     * 设置单个公网Zone状态
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>
     */
    public AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatusAsyncInvoker(
        UpdatePublicZoneStatusRequest request) {
        return new AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>(request,
            DnsMeta.updatePublicZoneStatus, hcClient);
    }

}
