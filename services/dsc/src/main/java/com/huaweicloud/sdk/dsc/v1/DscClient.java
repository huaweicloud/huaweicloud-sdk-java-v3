package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dsc.v1.model.*;

public class DscClient {

    protected HcClient hcClient;

    public DscClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DscClient> newBuilder() {
        return new ClientBuilder<>(DscClient::new);
    }

    /** 对数据进行脱敏 对数据进行脱敏
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return BatchAddDataMaskResponse */
    public BatchAddDataMaskResponse batchAddDataMask(BatchAddDataMaskRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /** 对数据进行脱敏 对数据进行脱敏
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> */
    public SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskInvoker(
        BatchAddDataMaskRequest request) {
        return new SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>(request, DscMeta.batchAddDataMask,
            hcClient);
    }

    /** 嵌入数据水印 对json体中数据动态添加水印
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return CreateDatabaseWaterMarkResponse */
    public CreateDatabaseWaterMarkResponse createDatabaseWaterMark(CreateDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /** 嵌入数据水印 对json体中数据动态添加水印
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> */
    public SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>(request,
            DscMeta.createDatabaseWaterMark, hcClient);
    }

    /** 嵌入文档水印 嵌入文档水印
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return CreateDocWatermarkResponse */
    public CreateDocWatermarkResponse createDocWatermark(CreateDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /** 嵌入文档水印 嵌入文档水印
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> */
    public SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkInvoker(
        CreateDocWatermarkRequest request) {
        return new SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>(request,
            DscMeta.createDocWatermark, hcClient);
    }

    /** 嵌入图片水印 给上传的图片添加暗水印，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp,
     * *.tga, *.tpic, *.gif。
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return CreateImageWatermarkResponse */
    public CreateImageWatermarkResponse createImageWatermark(CreateImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /** 嵌入图片水印 给上传的图片添加暗水印，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp,
     * *.tga, *.tpic, *.gif。
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> */
    public SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkInvoker(
        CreateImageWatermarkRequest request) {
        return new SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>(request,
            DscMeta.createImageWatermark, hcClient);
    }

    /** 提取数据水印 提取请求数据中水印内容
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return ShowDatabaseWaterMarkResponse */
    public ShowDatabaseWaterMarkResponse showDatabaseWaterMark(ShowDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /** 提取数据水印 提取请求数据中水印内容
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> */
    public SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>(request,
            DscMeta.showDatabaseWaterMark, hcClient);
    }

    /** 提取文档水印 提取文档水印
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return ShowDocWatermarkResponse */
    public ShowDocWatermarkResponse showDocWatermark(ShowDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /** 提取文档水印 提取文档水印
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> */
    public SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkInvoker(
        ShowDocWatermarkRequest request) {
        return new SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>(request, DscMeta.showDocWatermark,
            hcClient);
    }

    /** 提取图片水印 提取图片中的暗水印内容
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return ShowImageWatermarkResponse */
    public ShowImageWatermarkResponse showImageWatermark(ShowImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /** 提取图片水印 提取图片中的暗水印内容
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> */
    public SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkInvoker(
        ShowImageWatermarkRequest request) {
        return new SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>(request,
            DscMeta.showImageWatermark, hcClient);
    }

}
