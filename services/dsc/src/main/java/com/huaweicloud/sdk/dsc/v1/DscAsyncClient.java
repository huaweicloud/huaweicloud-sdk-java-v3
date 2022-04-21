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

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return CompletableFuture<BatchAddDataMaskResponse>
     */
    public CompletableFuture<BatchAddDataMaskResponse> batchAddDataMaskAsync(BatchAddDataMaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>
     */
    public AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskAsyncInvoker(
        BatchAddDataMaskRequest request) {
        return new AsyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>(request, DscMeta.batchAddDataMask,
            hcClient);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return CompletableFuture<CreateDatabaseWaterMarkResponse>
     */
    public CompletableFuture<CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsync(
        CreateDatabaseWaterMarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>
     */
    public AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkAsyncInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>(request,
            DscMeta.createDatabaseWaterMark, hcClient);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return CompletableFuture<CreateDocWatermarkResponse>
     */
    public CompletableFuture<CreateDocWatermarkResponse> createDocWatermarkAsync(CreateDocWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>
     */
    public AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkAsyncInvoker(
        CreateDocWatermarkRequest request) {
        return new AsyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>(request,
            DscMeta.createDocWatermark, hcClient);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<CreateDocWatermarkByAddressResponse>
     */
    public CompletableFuture<CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressAsync(
        CreateDocWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createDocWatermarkByAddress);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>
     */
    public AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressAsyncInvoker(
        CreateDocWatermarkByAddressRequest request) {
        return new AsyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>(request,
            DscMeta.createDocWatermarkByAddress, hcClient);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return CompletableFuture<CreateImageWatermarkResponse>
     */
    public CompletableFuture<CreateImageWatermarkResponse> createImageWatermarkAsync(
        CreateImageWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>
     */
    public AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkAsyncInvoker(
        CreateImageWatermarkRequest request) {
        return new AsyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>(request,
            DscMeta.createImageWatermark, hcClient);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<CreateImageWatermarkByAddressResponse>
     */
    public CompletableFuture<CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressAsync(
        CreateImageWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.createImageWatermarkByAddress);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>
     */
    public AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressAsyncInvoker(
        CreateImageWatermarkByAddressRequest request) {
        return new AsyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>(request,
            DscMeta.createImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return CompletableFuture<ShowDatabaseWaterMarkResponse>
     */
    public CompletableFuture<ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsync(
        ShowDatabaseWaterMarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>
     */
    public AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkAsyncInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new AsyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>(request,
            DscMeta.showDatabaseWaterMark, hcClient);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return CompletableFuture<ShowDocWatermarkResponse>
     */
    public CompletableFuture<ShowDocWatermarkResponse> showDocWatermarkAsync(ShowDocWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>
     */
    public AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkAsyncInvoker(
        ShowDocWatermarkRequest request) {
        return new AsyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>(request, DscMeta.showDocWatermark,
            hcClient);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<ShowDocWatermarkByAddressResponse>
     */
    public CompletableFuture<ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressAsync(
        ShowDocWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showDocWatermarkByAddress);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>
     */
    public AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressAsyncInvoker(
        ShowDocWatermarkByAddressRequest request) {
        return new AsyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>(request,
            DscMeta.showDocWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkResponse>
     */
    public CompletableFuture<ShowImageWatermarkResponse> showImageWatermarkAsync(ShowImageWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>
     */
    public AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkAsyncInvoker(
        ShowImageWatermarkRequest request) {
        return new AsyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>(request,
            DscMeta.showImageWatermark, hcClient);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkByAddressResponse>
     */
    public CompletableFuture<ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressAsync(
        ShowImageWatermarkByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermarkByAddress);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>
     */
    public AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressAsyncInvoker(
        ShowImageWatermarkByAddressRequest request) {
        return new AsyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>(request,
            DscMeta.showImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkWithImageResponse>
     */
    public CompletableFuture<ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageAsync(
        ShowImageWatermarkWithImageRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermarkWithImage);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>
     */
    public AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageAsyncInvoker(
        ShowImageWatermarkWithImageRequest request) {
        return new AsyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>(request,
            DscMeta.showImageWatermarkWithImage, hcClient);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return CompletableFuture<ShowImageWatermarkWithImageByAddressResponse>
     */
    public CompletableFuture<ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressAsync(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showImageWatermarkWithImageByAddress);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>
     */
    public AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressAsyncInvoker(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return new AsyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>(
            request, DscMeta.showImageWatermarkWithImageByAddress, hcClient);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return CompletableFuture<ShowScanJobResultsResponse>
     */
    public CompletableFuture<ShowScanJobResultsResponse> showScanJobResultsAsync(ShowScanJobResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showScanJobResults);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>
     */
    public AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsAsyncInvoker(
        ShowScanJobResultsRequest request) {
        return new AsyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>(request,
            DscMeta.showScanJobResults, hcClient);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
     * @return CompletableFuture<ShowScanJobsResponse>
     */
    public CompletableFuture<ShowScanJobsResponse> showScanJobsAsync(ShowScanJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showScanJobs);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
     * @return AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>
     */
    public AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsAsyncInvoker(
        ShowScanJobsRequest request) {
        return new AsyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>(request, DscMeta.showScanJobs, hcClient);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return CompletableFuture<ShowOpenApiCalledRecordsResponse>
     */
    public CompletableFuture<ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsAsync(
        ShowOpenApiCalledRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DscMeta.showOpenApiCalledRecords);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>
     */
    public AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsAsyncInvoker(
        ShowOpenApiCalledRecordsRequest request) {
        return new AsyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>(request,
            DscMeta.showOpenApiCalledRecords, hcClient);
    }

}
