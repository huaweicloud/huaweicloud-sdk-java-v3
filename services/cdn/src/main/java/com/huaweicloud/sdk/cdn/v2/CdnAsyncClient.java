package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreatePreheatingTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreatePreheatingTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateRefreshTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateRefreshTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DisableDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.DisableDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.EnableDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.EnableDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopRefersRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopRefersResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowCertificatesHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowCertificatesHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTaskDetailsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTaskDetailsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowIpInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowIpInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowLogsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowLogsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowUrlTaskInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowUrlTaskInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowVerifyDomainOwnerInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowVerifyDomainOwnerInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessResponse;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerRequest;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CdnAsyncClient {

    protected HcClient hcClient;

    public CdnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnAsyncClient> newBuilder() {
        ClientBuilder<CdnAsyncClient> clientBuilder = new ClientBuilder<>(CdnAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 批量域名复制
     *
     * 批量域名复制接口。
     *  &gt; 将某个加速域名的配置批量复制到其他域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCopyDomainRequest 请求对象
     * @return CompletableFuture<BatchCopyDomainResponse>
     */
    public CompletableFuture<BatchCopyDomainResponse> batchCopyDomainAsync(BatchCopyDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.batchCopyDomain);
    }

    /**
     * 批量域名复制
     *
     * 批量域名复制接口。
     *  &gt; 将某个加速域名的配置批量复制到其他域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCopyDomainRequest 请求对象
     * @return AsyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse>
     */
    public AsyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse> batchCopyDomainAsyncInvoker(
        BatchCopyDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.batchCopyDomain, hcClient);
    }

    /**
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.batchDeleteTags);
    }

    /**
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.batchDeleteTags, hcClient);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return CompletableFuture<CreateDomainResponse>
     */
    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createDomain);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createDomain, hcClient);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingTasksRequest 请求对象
     * @return CompletableFuture<CreatePreheatingTasksResponse>
     */
    public CompletableFuture<CreatePreheatingTasksResponse> createPreheatingTasksAsync(
        CreatePreheatingTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createPreheatingTasks);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingTasksRequest 请求对象
     * @return AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>
     */
    public AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksAsyncInvoker(
        CreatePreheatingTasksRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createPreheatingTasks, hcClient);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRefreshTasksRequest 请求对象
     * @return CompletableFuture<CreateRefreshTasksResponse>
     */
    public CompletableFuture<CreateRefreshTasksResponse> createRefreshTasksAsync(CreateRefreshTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createRefreshTasks);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRefreshTasksRequest 请求对象
     * @return AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>
     */
    public AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksAsyncInvoker(
        CreateRefreshTasksRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createRefreshTasks, hcClient);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return CompletableFuture<CreateTagsResponse>
     */
    public CompletableFuture<CreateTagsResponse> createTagsAsync(CreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createTags);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return AsyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public AsyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsAsyncInvoker(CreateTagsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createTags, hcClient);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return CompletableFuture<DeleteDomainResponse>
     */
    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.deleteDomain);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.deleteDomain, hcClient);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDomainRequest 请求对象
     * @return CompletableFuture<DisableDomainResponse>
     */
    public CompletableFuture<DisableDomainResponse> disableDomainAsync(DisableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.disableDomain);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDomainRequest 请求对象
     * @return AsyncInvoker<DisableDomainRequest, DisableDomainResponse>
     */
    public AsyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainAsyncInvoker(
        DisableDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.disableDomain, hcClient);
    }

    /**
     * 下载区域运营商指标数据表格文件
     *
     * - 下载区域运营商指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据表格。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRegionCarrierExcelRequest 请求对象
     * @return CompletableFuture<DownloadRegionCarrierExcelResponse>
     */
    @Deprecated
    public CompletableFuture<DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcelAsync(
        DownloadRegionCarrierExcelRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.downloadRegionCarrierExcel);
    }

    /**
     * 下载区域运营商指标数据表格文件
     *
     * - 下载区域运营商指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据表格。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRegionCarrierExcelRequest 请求对象
     * @return AsyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse>
     */
    @Deprecated
    public AsyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcelAsyncInvoker(
        DownloadRegionCarrierExcelRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.downloadRegionCarrierExcel, hcClient);
    }

    /**
     * 下载统计指标数据表格文件
     *
     * - 下载统计指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadStatisticsExcelRequest 请求对象
     * @return CompletableFuture<DownloadStatisticsExcelResponse>
     */
    @Deprecated
    public CompletableFuture<DownloadStatisticsExcelResponse> downloadStatisticsExcelAsync(
        DownloadStatisticsExcelRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.downloadStatisticsExcel);
    }

    /**
     * 下载统计指标数据表格文件
     *
     * - 下载统计指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadStatisticsExcelRequest 请求对象
     * @return AsyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse>
     */
    @Deprecated
    public AsyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> downloadStatisticsExcelAsyncInvoker(
        DownloadStatisticsExcelRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.downloadStatisticsExcel, hcClient);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return CompletableFuture<EnableDomainResponse>
     */
    public CompletableFuture<EnableDomainResponse> enableDomainAsync(EnableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.enableDomain);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return AsyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public AsyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainAsyncInvoker(
        EnableDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.enableDomain, hcClient);
    }

    /**
     * 查询统计TOP100 referer数据明细
     *
     * - 查询TOP100 referer数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopRefersRequest 请求对象
     * @return CompletableFuture<ListCdnDomainTopRefersResponse>
     */
    public CompletableFuture<ListCdnDomainTopRefersResponse> listCdnDomainTopRefersAsync(
        ListCdnDomainTopRefersRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.listCdnDomainTopRefers);
    }

    /**
     * 查询统计TOP100 referer数据明细
     *
     * - 查询TOP100 referer数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopRefersRequest 请求对象
     * @return AsyncInvoker<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse>
     */
    public AsyncInvoker<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse> listCdnDomainTopRefersAsyncInvoker(
        ListCdnDomainTopRefersRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.listCdnDomainTopRefers, hcClient);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.listDomains);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.listDomains, hcClient);
    }

    /**
     * 设置用户计费模式
     *
     * - 设置用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内）
     * 
     * - 计费模式仅支持设置flux（流量），v2及以上客户支持bw（带宽）
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetChargeModesRequest 请求对象
     * @return CompletableFuture<SetChargeModesResponse>
     */
    public CompletableFuture<SetChargeModesResponse> setChargeModesAsync(SetChargeModesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.setChargeModes);
    }

    /**
     * 设置用户计费模式
     *
     * - 设置用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内）
     * 
     * - 计费模式仅支持设置flux（流量），v2及以上客户支持bw（带宽）
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetChargeModesRequest 请求对象
     * @return AsyncInvoker<SetChargeModesRequest, SetChargeModesResponse>
     */
    public AsyncInvoker<SetChargeModesRequest, SetChargeModesResponse> setChargeModesAsyncInvoker(
        SetChargeModesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.setChargeModes, hcClient);
    }

    /**
     * 查询域名带宽峰值类数据
     *
     * - 查询域名带宽峰值类数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、峰值类指标单位统一为bps（比特率），请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthCalcRequest 请求对象
     * @return CompletableFuture<ShowBandwidthCalcResponse>
     */
    @Deprecated
    public CompletableFuture<ShowBandwidthCalcResponse> showBandwidthCalcAsync(ShowBandwidthCalcRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showBandwidthCalc);
    }

    /**
     * 查询域名带宽峰值类数据
     *
     * - 查询域名带宽峰值类数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、峰值类指标单位统一为bps（比特率），请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthCalcRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> showBandwidthCalcAsyncInvoker(
        ShowBandwidthCalcRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showBandwidthCalc, hcClient);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatesHttpsInfoRequest 请求对象
     * @return CompletableFuture<ShowCertificatesHttpsInfoResponse>
     */
    public CompletableFuture<ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsync(
        ShowCertificatesHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showCertificatesHttpsInfo);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatesHttpsInfoRequest 请求对象
     * @return AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>
     */
    public AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsyncInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    /**
     * 查询用户计费模式
     *
     * - 查询用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内，默认）和outside_mainland_china（海外）
     * 
     * - 计费模式状态支持active（已生效），upcoming（待生效）两种状态，默认为active(已生效)
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChargeModesRequest 请求对象
     * @return CompletableFuture<ShowChargeModesResponse>
     */
    public CompletableFuture<ShowChargeModesResponse> showChargeModesAsync(ShowChargeModesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showChargeModes);
    }

    /**
     * 查询用户计费模式
     *
     * - 查询用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内，默认）和outside_mainland_china（海外）
     * 
     * - 计费模式状态支持active（已生效），upcoming（待生效）两种状态，默认为active(已生效)
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChargeModesRequest 请求对象
     * @return AsyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse>
     */
    public AsyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse> showChargeModesAsyncInvoker(
        ShowChargeModesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showChargeModes, hcClient);
    }

    /**
     * 查询加速域名详情
     *
     * 加速域名详情信息接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailByNameRequest 请求对象
     * @return CompletableFuture<ShowDomainDetailByNameResponse>
     */
    public CompletableFuture<ShowDomainDetailByNameResponse> showDomainDetailByNameAsync(
        ShowDomainDetailByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainDetailByName);
    }

    /**
     * 查询加速域名详情
     *
     * 加速域名详情信息接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailByNameRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse>
     */
    public AsyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> showDomainDetailByNameAsyncInvoker(
        ShowDomainDetailByNameRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainDetailByName, hcClient);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持查询业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、 Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainFullConfigRequest 请求对象
     * @return CompletableFuture<ShowDomainFullConfigResponse>
     */
    public CompletableFuture<ShowDomainFullConfigResponse> showDomainFullConfigAsync(
        ShowDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持查询业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、 Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>
     */
    public AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigAsyncInvoker(
        ShowDomainFullConfigRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainFullConfig, hcClient);
    }

    /**
     * 按区域运营商查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：location_detail,location_summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的区域运营商明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainLocationStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainLocationStatsResponse>
     */
    public CompletableFuture<ShowDomainLocationStatsResponse> showDomainLocationStatsAsync(
        ShowDomainLocationStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    /**
     * 按区域运营商查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：location_detail,location_summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的区域运营商明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainLocationStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>
     */
    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainLocationStats, hcClient);
    }

    /**
     * 查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：detail,summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainStatsResponse>
     */
    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    /**
     * 查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：detail,summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>
     */
    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainStats, hcClient);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowHistoryTaskDetailsResponse>
     */
    public CompletableFuture<ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsync(
        ShowHistoryTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHistoryTaskDetails);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>
     */
    public AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsyncInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showHistoryTaskDetails, hcClient);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTasksRequest 请求对象
     * @return CompletableFuture<ShowHistoryTasksResponse>
     */
    public CompletableFuture<ShowHistoryTasksResponse> showHistoryTasksAsync(ShowHistoryTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHistoryTasks);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTasksRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>
     */
    public AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksAsyncInvoker(
        ShowHistoryTasksRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showHistoryTasks, hcClient);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpInfoRequest 请求对象
     * @return CompletableFuture<ShowIpInfoResponse>
     */
    public CompletableFuture<ShowIpInfoResponse> showIpInfoAsync(ShowIpInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showIpInfo);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpInfoRequest 请求对象
     * @return AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>
     */
    public AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoAsyncInvoker(ShowIpInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showIpInfo, hcClient);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsRequest 请求对象
     * @return CompletableFuture<ShowLogsResponse>
     */
    public CompletableFuture<ShowLogsResponse> showLogsAsync(ShowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showLogs);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsRequest 请求对象
     * @return AsyncInvoker<ShowLogsRequest, ShowLogsResponse>
     */
    public AsyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsAsyncInvoker(ShowLogsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showLogs, hcClient);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showQuota);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showQuota, hcClient);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return CompletableFuture<ShowTagsResponse>
     */
    public CompletableFuture<ShowTagsResponse> showTagsAsync(ShowTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTags);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return AsyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public AsyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsAsyncInvoker(ShowTagsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showTags, hcClient);
    }

    /**
     * 查询TOP域名
     *
     * - 查询TOP域名。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过1天。
     * 
     * - 起始时间和结束时间，左闭右开，必须同时指定。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传整点毫秒级时间戳。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopDomainNamesRequest 请求对象
     * @return CompletableFuture<ShowTopDomainNamesResponse>
     */
    @Deprecated
    public CompletableFuture<ShowTopDomainNamesResponse> showTopDomainNamesAsync(ShowTopDomainNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopDomainNames);
    }

    /**
     * 查询TOP域名
     *
     * - 查询TOP域名。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过1天。
     * 
     * - 起始时间和结束时间，左闭右开，必须同时指定。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传整点毫秒级时间戳。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopDomainNamesRequest 请求对象
     * @return AsyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> showTopDomainNamesAsyncInvoker(
        ShowTopDomainNamesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showTopDomainNames, hcClient);
    }

    /**
     * 查询TOP100 URL明细
     *
     * - 查询TOP100 URL明细。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
     * 
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * 
     * - 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopUrlRequest 请求对象
     * @return CompletableFuture<ShowTopUrlResponse>
     */
    public CompletableFuture<ShowTopUrlResponse> showTopUrlAsync(ShowTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    /**
     * 查询TOP100 URL明细
     *
     * - 查询TOP100 URL明细。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
     * 
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * 
     * - 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopUrlRequest 请求对象
     * @return AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showTopUrl, hcClient);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUrlTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowUrlTaskInfoResponse>
     */
    public CompletableFuture<ShowUrlTaskInfoResponse> showUrlTaskInfoAsync(ShowUrlTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showUrlTaskInfo);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUrlTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>
     */
    public AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfoAsyncInvoker(
        ShowUrlTaskInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showUrlTaskInfo, hcClient);
    }

    /**
     * 查询域名归属校验信息
     *
     * 用于查询域名归属校验信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVerifyDomainOwnerInfoRequest 请求对象
     * @return CompletableFuture<ShowVerifyDomainOwnerInfoResponse>
     */
    public CompletableFuture<ShowVerifyDomainOwnerInfoResponse> showVerifyDomainOwnerInfoAsync(
        ShowVerifyDomainOwnerInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showVerifyDomainOwnerInfo);
    }

    /**
     * 查询域名归属校验信息
     *
     * 用于查询域名归属校验信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVerifyDomainOwnerInfoRequest 请求对象
     * @return AsyncInvoker<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse>
     */
    public AsyncInvoker<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse> showVerifyDomainOwnerInfoAsyncInvoker(
        ShowVerifyDomainOwnerInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showVerifyDomainOwnerInfo, hcClient);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，支持修改业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainFullConfigRequest 请求对象
     * @return CompletableFuture<UpdateDomainFullConfigResponse>
     */
    public CompletableFuture<UpdateDomainFullConfigResponse> updateDomainFullConfigAsync(
        UpdateDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，支持修改业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>
     */
    public AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigAsyncInvoker(
        UpdateDomainFullConfigRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateDomainFullConfig, hcClient);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainMultiCertificatesRequest 请求对象
     * @return CompletableFuture<UpdateDomainMultiCertificatesResponse>
     */
    public CompletableFuture<UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsync(
        UpdateDomainMultiCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainMultiCertificates);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainMultiCertificatesRequest 请求对象
     * @return AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>
     */
    public AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsyncInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateBucketAccessRequest 请求对象
     * @return CompletableFuture<UpdatePrivateBucketAccessResponse>
     */
    public CompletableFuture<UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsync(
        UpdatePrivateBucketAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updatePrivateBucketAccess);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateBucketAccessRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>
     */
    public AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsyncInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updatePrivateBucketAccess, hcClient);
    }

    /**
     * 域名归属校验
     *
     * 用于域名归属校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyDomainOwnerRequest 请求对象
     * @return CompletableFuture<VerifyDomainOwnerResponse>
     */
    public CompletableFuture<VerifyDomainOwnerResponse> verifyDomainOwnerAsync(VerifyDomainOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.verifyDomainOwner);
    }

    /**
     * 域名归属校验
     *
     * 用于域名归属校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyDomainOwnerRequest 请求对象
     * @return AsyncInvoker<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse>
     */
    public AsyncInvoker<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse> verifyDomainOwnerAsyncInvoker(
        VerifyDomainOwnerRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.verifyDomainOwner, hcClient);
    }

}
