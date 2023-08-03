package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcResponse;
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
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigResponse;
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
     * @param BatchCopyDomainRequest 请求对象
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
     * @param BatchCopyDomainRequest 请求对象
     * @return AsyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse>
     */
    public AsyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse> batchCopyDomainAsyncInvoker(
        BatchCopyDomainRequest request) {
        return new AsyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse>(request, CdnMeta.batchCopyDomain,
            hcClient);
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
     * @param DownloadRegionCarrierExcelRequest 请求对象
     * @return CompletableFuture<DownloadRegionCarrierExcelResponse>
     */
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
     * @param DownloadRegionCarrierExcelRequest 请求对象
     * @return AsyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse>
     */
    public AsyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcelAsyncInvoker(
        DownloadRegionCarrierExcelRequest request) {
        return new AsyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse>(request,
            CdnMeta.downloadRegionCarrierExcel, hcClient);
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
     * @param DownloadStatisticsExcelRequest 请求对象
     * @return CompletableFuture<DownloadStatisticsExcelResponse>
     */
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
     * @param DownloadStatisticsExcelRequest 请求对象
     * @return AsyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse>
     */
    public AsyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> downloadStatisticsExcelAsyncInvoker(
        DownloadStatisticsExcelRequest request) {
        return new AsyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse>(request,
            CdnMeta.downloadStatisticsExcel, hcClient);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
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
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CdnMeta.listDomains, hcClient);
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
     * @param SetChargeModesRequest 请求对象
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
     * @param SetChargeModesRequest 请求对象
     * @return AsyncInvoker<SetChargeModesRequest, SetChargeModesResponse>
     */
    public AsyncInvoker<SetChargeModesRequest, SetChargeModesResponse> setChargeModesAsyncInvoker(
        SetChargeModesRequest request) {
        return new AsyncInvoker<SetChargeModesRequest, SetChargeModesResponse>(request, CdnMeta.setChargeModes,
            hcClient);
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
     * @param ShowBandwidthCalcRequest 请求对象
     * @return CompletableFuture<ShowBandwidthCalcResponse>
     */
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
     * @param ShowBandwidthCalcRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse>
     */
    public AsyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> showBandwidthCalcAsyncInvoker(
        ShowBandwidthCalcRequest request) {
        return new AsyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse>(request, CdnMeta.showBandwidthCalc,
            hcClient);
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
     * @param ShowChargeModesRequest 请求对象
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
     * @param ShowChargeModesRequest 请求对象
     * @return AsyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse>
     */
    public AsyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse> showChargeModesAsyncInvoker(
        ShowChargeModesRequest request) {
        return new AsyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse>(request, CdnMeta.showChargeModes,
            hcClient);
    }

    /**
     * 查询加速域名详情
     *
     * 加速域名详情信息接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainDetailByNameRequest 请求对象
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
     * @param ShowDomainDetailByNameRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse>
     */
    public AsyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> showDomainDetailByNameAsyncInvoker(
        ShowDomainDetailByNameRequest request) {
        return new AsyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse>(request,
            CdnMeta.showDomainDetailByName, hcClient);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持查询业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、 Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainFullConfigRequest 请求对象
     * @return CompletableFuture<ShowDomainFullConfigResponse>
     */
    public CompletableFuture<ShowDomainFullConfigResponse> showDomainFullConfigAsync(
        ShowDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持查询业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、 Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>
     */
    public AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigAsyncInvoker(
        ShowDomainFullConfigRequest request) {
        return new AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>(request,
            CdnMeta.showDomainFullConfig, hcClient);
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
     * @param ShowDomainLocationStatsRequest 请求对象
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
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>
     */
    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    /**
     * 查询域名统计基础数据
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
     * @param ShowDomainStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainStatsResponse>
     */
    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    /**
     * 查询域名统计基础数据
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
     * @param ShowDomainStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>
     */
    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
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
     * @param ShowTopDomainNamesRequest 请求对象
     * @return CompletableFuture<ShowTopDomainNamesResponse>
     */
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
     * @param ShowTopDomainNamesRequest 请求对象
     * @return AsyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse>
     */
    public AsyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> showTopDomainNamesAsyncInvoker(
        ShowTopDomainNamesRequest request) {
        return new AsyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse>(request,
            CdnMeta.showTopDomainNames, hcClient);
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
     * @param ShowTopUrlRequest 请求对象
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
     * @param ShowTopUrlRequest 请求对象
     * @return AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，支持修改业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainFullConfigRequest 请求对象
     * @return CompletableFuture<UpdateDomainFullConfigResponse>
     */
    public CompletableFuture<UpdateDomainFullConfigResponse> updateDomainFullConfigAsync(
        UpdateDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，支持修改业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>
     */
    public AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigAsyncInvoker(
        UpdateDomainFullConfigRequest request) {
        return new AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>(request,
            CdnMeta.updateDomainFullConfig, hcClient);
    }

}
