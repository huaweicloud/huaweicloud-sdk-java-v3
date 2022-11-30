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

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return BatchAddDataMaskResponse
     */
    public BatchAddDataMaskResponse batchAddDataMask(BatchAddDataMaskRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>
     */
    public SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskInvoker(
        BatchAddDataMaskRequest request) {
        return new SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>(request, DscMeta.batchAddDataMask,
            hcClient);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return CreateDatabaseWaterMarkResponse
     */
    public CreateDatabaseWaterMarkResponse createDatabaseWaterMark(CreateDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>
     */
    public SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>(request,
            DscMeta.createDatabaseWaterMark, hcClient);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return CreateDocWatermarkResponse
     */
    public CreateDocWatermarkResponse createDocWatermark(CreateDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>
     */
    public SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkInvoker(
        CreateDocWatermarkRequest request) {
        return new SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>(request,
            DscMeta.createDocWatermark, hcClient);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return CreateDocWatermarkByAddressResponse
     */
    public CreateDocWatermarkByAddressResponse createDocWatermarkByAddress(CreateDocWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermarkByAddress);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>
     */
    public SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressInvoker(
        CreateDocWatermarkByAddressRequest request) {
        return new SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>(request,
            DscMeta.createDocWatermarkByAddress, hcClient);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return CreateImageWatermarkResponse
     */
    public CreateImageWatermarkResponse createImageWatermark(CreateImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>
     */
    public SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkInvoker(
        CreateImageWatermarkRequest request) {
        return new SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>(request,
            DscMeta.createImageWatermark, hcClient);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return CreateImageWatermarkByAddressResponse
     */
    public CreateImageWatermarkByAddressResponse createImageWatermarkByAddress(
        CreateImageWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermarkByAddress);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>
     */
    public SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressInvoker(
        CreateImageWatermarkByAddressRequest request) {
        return new SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>(request,
            DscMeta.createImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return ShowDatabaseWaterMarkResponse
     */
    public ShowDatabaseWaterMarkResponse showDatabaseWaterMark(ShowDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>
     */
    public SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>(request,
            DscMeta.showDatabaseWaterMark, hcClient);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return ShowDocWatermarkResponse
     */
    public ShowDocWatermarkResponse showDocWatermark(ShowDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>
     */
    public SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkInvoker(
        ShowDocWatermarkRequest request) {
        return new SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>(request, DscMeta.showDocWatermark,
            hcClient);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return ShowDocWatermarkByAddressResponse
     */
    public ShowDocWatermarkByAddressResponse showDocWatermarkByAddress(ShowDocWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermarkByAddress);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>
     */
    public SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressInvoker(
        ShowDocWatermarkByAddressRequest request) {
        return new SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>(request,
            DscMeta.showDocWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return ShowImageWatermarkResponse
     */
    public ShowImageWatermarkResponse showImageWatermark(ShowImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>
     */
    public SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkInvoker(
        ShowImageWatermarkRequest request) {
        return new SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>(request,
            DscMeta.showImageWatermark, hcClient);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return ShowImageWatermarkByAddressResponse
     */
    public ShowImageWatermarkByAddressResponse showImageWatermarkByAddress(ShowImageWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkByAddress);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>
     */
    public SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressInvoker(
        ShowImageWatermarkByAddressRequest request) {
        return new SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>(request,
            DscMeta.showImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return ShowImageWatermarkWithImageResponse
     */
    public ShowImageWatermarkWithImageResponse showImageWatermarkWithImage(ShowImageWatermarkWithImageRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkWithImage);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>
     */
    public SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageInvoker(
        ShowImageWatermarkWithImageRequest request) {
        return new SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>(request,
            DscMeta.showImageWatermarkWithImage, hcClient);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return ShowImageWatermarkWithImageByAddressResponse
     */
    public ShowImageWatermarkWithImageByAddressResponse showImageWatermarkWithImageByAddress(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkWithImageByAddress);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>
     */
    public SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressInvoker(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return new SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>(
            request, DscMeta.showImageWatermarkWithImageByAddress, hcClient);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return ShowScanJobResultsResponse
     */
    public ShowScanJobResultsResponse showScanJobResults(ShowScanJobResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showScanJobResults);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>
     */
    public SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsInvoker(
        ShowScanJobResultsRequest request) {
        return new SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>(request,
            DscMeta.showScanJobResults, hcClient);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
     * @return ShowScanJobsResponse
     */
    public ShowScanJobsResponse showScanJobs(ShowScanJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showScanJobs);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
     * @return SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>
     */
    public SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsInvoker(ShowScanJobsRequest request) {
        return new SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>(request, DscMeta.showScanJobs, hcClient);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return ShowOpenApiCalledRecordsResponse
     */
    public ShowOpenApiCalledRecordsResponse showOpenApiCalledRecords(ShowOpenApiCalledRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showOpenApiCalledRecords);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>
     */
    public SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsInvoker(
        ShowOpenApiCalledRecordsRequest request) {
        return new SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>(request,
            DscMeta.showOpenApiCalledRecords, hcClient);
    }

}
