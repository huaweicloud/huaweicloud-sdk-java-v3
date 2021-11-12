package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dsc.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DscAsyncClient {

    protected HcClient hcClient;

    public DscAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DscAsyncClient> newBuilder() {
        return new ClientBuilder<>(DscAsyncClient::new);
    }

    /** 对数据进行脱敏 对数据进行脱敏
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return CompletableFuture<BatchAddDataMaskResponse> */
    public CompletableFuture<BatchAddDataMaskResponse> batchAddDataMaskAsync(BatchAddDataMaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /** 对数据进行脱敏 对数据进行脱敏
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> */
    public AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskAsyncInvoker(
        BatchAddDataMaskRequest request) {
        return new AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>(request, DscMeta.batchAddDataMask,
            hcClient);
    }

    /** 嵌入数据水印 对json体中数据动态添加水印
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return CompletableFuture<CreateDatabaseWaterMarkResponse> */
    public CompletableFuture<CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsync(
        CreateDatabaseWaterMarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /** 嵌入数据水印 对json体中数据动态添加水印
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> */
    public AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsyncInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>(request,
            DscMeta.createDatabaseWaterMark, hcClient);
    }

    /** 嵌入文档水印 嵌入文档水印
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return CompletableFuture<CreateDocWatermarkResponse> */
    public CompletableFuture<CreateDocWatermarkResponse> createDocWatermarkAsync(CreateDocWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /** 嵌入文档水印 嵌入文档水印
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> */
    public AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkAsyncInvoker(
        CreateDocWatermarkRequest request) {
        return new AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>(request,
            DscMeta.createDocWatermark, hcClient);
    }

    /** 嵌入图片水印 给上传的图片添加暗水印，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp,
     * *.tga, *.tpic, *.gif。
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return CompletableFuture<CreateImageWatermarkResponse> */
    public CompletableFuture<CreateImageWatermarkResponse> createImageWatermarkAsync(
        CreateImageWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /** 嵌入图片水印 给上传的图片添加暗水印，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp,
     * *.tga, *.tpic, *.gif。
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> */
    public AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkAsyncInvoker(
        CreateImageWatermarkRequest request) {
        return new AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>(request,
            DscMeta.createImageWatermark, hcClient);
    }

    /** 提取数据水印 提取请求数据中水印内容
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return CompletableFuture<ShowDatabaseWaterMarkResponse> */
    public CompletableFuture<ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsync(
        ShowDatabaseWaterMarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /** 提取数据水印 提取请求数据中水印内容
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> */
    public AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsyncInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>(request,
            DscMeta.showDatabaseWaterMark, hcClient);
    }

    /** 提取文档水印 提取文档水印
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return CompletableFuture<ShowDocWatermarkResponse> */
    public CompletableFuture<ShowDocWatermarkResponse> showDocWatermarkAsync(ShowDocWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /** 提取文档水印 提取文档水印
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> */
    public AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkAsyncInvoker(
        ShowDocWatermarkRequest request) {
        return new AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>(request, DscMeta.showDocWatermark,
            hcClient);
    }

    /** 提取图片水印 提取图片中的暗水印内容
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkResponse> */
    public CompletableFuture<ShowImageWatermarkResponse> showImageWatermarkAsync(ShowImageWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /** 提取图片水印 提取图片中的暗水印内容
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> */
    public AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkAsyncInvoker(
        ShowImageWatermarkRequest request) {
        return new AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>(request,
            DscMeta.showImageWatermark, hcClient);
    }

    /** 查询指定任务扫描结果 查询指定任务扫描结果
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return CompletableFuture<ShowScanJobResultsResponse> */
    public CompletableFuture<ShowScanJobResultsResponse> showScanJobResultsAsync(ShowScanJobResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showScanJobResults);
    }

    /** 查询指定任务扫描结果 查询指定任务扫描结果
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> */
    public AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsAsyncInvoker(
        ShowScanJobResultsRequest request) {
        return new AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>(request,
            DscMeta.showScanJobResults, hcClient);
    }

    /** 查询扫描任务列表 查询扫描任务列表
     *
     * @param ShowScanJobsRequest 请求对象
     * @return CompletableFuture<ShowScanJobsResponse> */
    public CompletableFuture<ShowScanJobsResponse> showScanJobsAsync(ShowScanJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showScanJobs);
    }

    /** 查询扫描任务列表 查询扫描任务列表
     *
     * @param ShowScanJobsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> */
    public AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsAsyncInvoker(
        ShowScanJobsRequest request) {
        return new AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>(request, DscMeta.showScanJobs, hcClient);
    }

}
