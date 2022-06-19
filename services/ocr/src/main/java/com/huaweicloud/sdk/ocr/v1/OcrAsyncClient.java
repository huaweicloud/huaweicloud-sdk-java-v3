package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ocr.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class OcrAsyncClient {

    protected HcClient hcClient;

    public OcrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OcrAsyncClient> newBuilder() {
        return new ClientBuilder<>(OcrAsyncClient::new, "BasicCredentials");
    }

    /**
     * 智能分类识别
     *
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。
     * 
     * 计费次数说明：
     * 
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return CompletableFuture<RecognizeAutoClassificationResponse>
     */
    public CompletableFuture<RecognizeAutoClassificationResponse> recognizeAutoClassificationAsync(
        RecognizeAutoClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeAutoClassification);
    }

    /**
     * 智能分类识别
     *
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。
     * 
     * 计费次数说明：
     * 
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>
     */
    public AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassificationAsyncInvoker(
        RecognizeAutoClassificationRequest request) {
        return new AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>(request,
            OcrMeta.recognizeAutoClassification, hcClient);
    }

    /**
     * 银行卡识别
     *
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return CompletableFuture<RecognizeBankcardResponse>
     */
    public CompletableFuture<RecognizeBankcardResponse> recognizeBankcardAsync(RecognizeBankcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBankcard);
    }

    /**
     * 银行卡识别
     *
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>
     */
    public AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcardAsyncInvoker(
        RecognizeBankcardRequest request) {
        return new AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>(request, OcrMeta.recognizeBankcard,
            hcClient);
    }

    /**
     * 名片识别
     *
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return CompletableFuture<RecognizeBusinessCardResponse>
     */
    public CompletableFuture<RecognizeBusinessCardResponse> recognizeBusinessCardAsync(
        RecognizeBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBusinessCard);
    }

    /**
     * 名片识别
     *
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>
     */
    public AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCardAsyncInvoker(
        RecognizeBusinessCardRequest request) {
        return new AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>(request,
            OcrMeta.recognizeBusinessCard, hcClient);
    }

    /**
     * 营业执照识别
     *
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeBusinessLicenseResponse>
     */
    public CompletableFuture<RecognizeBusinessLicenseResponse> recognizeBusinessLicenseAsync(
        RecognizeBusinessLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBusinessLicense);
    }

    /**
     * 营业执照识别
     *
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>
     */
    public AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicenseAsyncInvoker(
        RecognizeBusinessLicenseRequest request) {
        return new AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>(request,
            OcrMeta.recognizeBusinessLicense, hcClient);
    }

    /**
     * 智利身份证识别
     *
     * 识别智利身份证图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeChileIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeChileIdCardResponse>
     */
    public CompletableFuture<RecognizeChileIdCardResponse> recognizeChileIdCardAsync(
        RecognizeChileIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeChileIdCard);
    }

    /**
     * 智利身份证识别
     *
     * 识别智利身份证图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeChileIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse>
     */
    public AsyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> recognizeChileIdCardAsyncInvoker(
        RecognizeChileIdCardRequest request) {
        return new AsyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse>(request,
            OcrMeta.recognizeChileIdCard, hcClient);
    }

    /**
     * 驾驶证识别
     *
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeDriverLicenseResponse>
     */
    public CompletableFuture<RecognizeDriverLicenseResponse> recognizeDriverLicenseAsync(
        RecognizeDriverLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeDriverLicense);
    }

    /**
     * 驾驶证识别
     *
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>
     */
    public AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicenseAsyncInvoker(
        RecognizeDriverLicenseRequest request) {
        return new AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>(request,
            OcrMeta.recognizeDriverLicense, hcClient);
    }

    /**
     * 财务报表识别
     *
     * 识别用户上传的表格图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFinancialStatementRequest 请求对象
     * @return CompletableFuture<RecognizeFinancialStatementResponse>
     */
    public CompletableFuture<RecognizeFinancialStatementResponse> recognizeFinancialStatementAsync(
        RecognizeFinancialStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeFinancialStatement);
    }

    /**
     * 财务报表识别
     *
     * 识别用户上传的表格图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFinancialStatementRequest 请求对象
     * @return AsyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse>
     */
    public AsyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> recognizeFinancialStatementAsyncInvoker(
        RecognizeFinancialStatementRequest request) {
        return new AsyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse>(request,
            OcrMeta.recognizeFinancialStatement, hcClient);
    }

    /**
     * 飞机行程单识别
     *
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return CompletableFuture<RecognizeFlightItineraryResponse>
     */
    public CompletableFuture<RecognizeFlightItineraryResponse> recognizeFlightItineraryAsync(
        RecognizeFlightItineraryRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeFlightItinerary);
    }

    /**
     * 飞机行程单识别
     *
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>
     */
    public AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItineraryAsyncInvoker(
        RecognizeFlightItineraryRequest request) {
        return new AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>(request,
            OcrMeta.recognizeFlightItinerary, hcClient);
    }

    /**
     * 通用表格识别
     *
     * 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return CompletableFuture<RecognizeGeneralTableResponse>
     */
    public CompletableFuture<RecognizeGeneralTableResponse> recognizeGeneralTableAsync(
        RecognizeGeneralTableRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeGeneralTable);
    }

    /**
     * 通用表格识别
     *
     * 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>
     */
    public AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTableAsyncInvoker(
        RecognizeGeneralTableRequest request) {
        return new AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>(request,
            OcrMeta.recognizeGeneralTable, hcClient);
    }

    /**
     * 通用文字识别
     *
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return CompletableFuture<RecognizeGeneralTextResponse>
     */
    public CompletableFuture<RecognizeGeneralTextResponse> recognizeGeneralTextAsync(
        RecognizeGeneralTextRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeGeneralText);
    }

    /**
     * 通用文字识别
     *
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>
     */
    public AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralTextAsyncInvoker(
        RecognizeGeneralTextRequest request) {
        return new AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>(request,
            OcrMeta.recognizeGeneralText, hcClient);
    }

    /**
     * 手写文字识别
     *
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return CompletableFuture<RecognizeHandwritingResponse>
     */
    public CompletableFuture<RecognizeHandwritingResponse> recognizeHandwritingAsync(
        RecognizeHandwritingRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeHandwriting);
    }

    /**
     * 手写文字识别
     *
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>
     */
    public AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwritingAsyncInvoker(
        RecognizeHandwritingRequest request) {
        return new AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>(request,
            OcrMeta.recognizeHandwriting, hcClient);
    }

    /**
     * 防疫健康码识别
     *
     * 识别防疫健康码中的文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHealthCodeRequest 请求对象
     * @return CompletableFuture<RecognizeHealthCodeResponse>
     */
    public CompletableFuture<RecognizeHealthCodeResponse> recognizeHealthCodeAsync(RecognizeHealthCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeHealthCode);
    }

    /**
     * 防疫健康码识别
     *
     * 识别防疫健康码中的文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHealthCodeRequest 请求对象
     * @return AsyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse>
     */
    public AsyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> recognizeHealthCodeAsyncInvoker(
        RecognizeHealthCodeRequest request) {
        return new AsyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse>(request,
            OcrMeta.recognizeHealthCode, hcClient);
    }

    /**
     * 身份证识别
     *
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 身份证识别支持中华人民共和国居民身份证识别。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeIdCardResponse>
     */
    public CompletableFuture<RecognizeIdCardResponse> recognizeIdCardAsync(RecognizeIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeIdCard);
    }

    /**
     * 身份证识别
     *
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 身份证识别支持中华人民共和国居民身份证识别。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>
     */
    public AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCardAsyncInvoker(
        RecognizeIdCardRequest request) {
        return new AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>(request, OcrMeta.recognizeIdCard,
            hcClient);
    }

    /**
     * 通用证件识别
     *
     * 识别身份证件图像，并将识别的结构化结果返回给用户。支持多个国家的身份证、驾驶证和护照，具体国家和证件列表详见表1。
     * 
     * **表1支持国家列表**
     * 
     * | 国家/地区  | 英文名称    | 国家代码  country_region | 支持证件类型  id_type   |
     * | ---------- | ----------- | ------------------------ | ----------------------- |
     * | 越南       | Vietnam     | VNM                      | PP、DL、ID              |
     * | 印度       | India       | IND                      | PP                      |
     * | 菲律宾     | Philippines | PHL                      | PP、DL、ID(仅支持UUMID) |
     * | 阿尔巴尼亚 | Albania     | ALB                      | PP、DL、ID              |
     * | 巴西       | BRAZIL      | BRA                      | PP                      |
     * | 印度尼西亚 | INDONESIA   | IDN                      | PP                      |
     * | 马来西亚   | MALAYSIA    | MYS                      | PP                      |
     * | 尼日利亚   | NIGERIA     | NGA                      | PP                      |
     * | 巴基斯坦   | PAKISTAN    | PAK                      | PP                      |
     * | 俄罗斯     | RUSSIA      | RUS                      | PP(仅支持国际标准版本)  |
     * | 中国台湾   | TAIWAN      | TWN                      | PP                      |
     * | 乌克兰     | UKRAINE     | UKR                      | PP                      |
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdDocumentRequest 请求对象
     * @return CompletableFuture<RecognizeIdDocumentResponse>
     */
    public CompletableFuture<RecognizeIdDocumentResponse> recognizeIdDocumentAsync(RecognizeIdDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeIdDocument);
    }

    /**
     * 通用证件识别
     *
     * 识别身份证件图像，并将识别的结构化结果返回给用户。支持多个国家的身份证、驾驶证和护照，具体国家和证件列表详见表1。
     * 
     * **表1支持国家列表**
     * 
     * | 国家/地区  | 英文名称    | 国家代码  country_region | 支持证件类型  id_type   |
     * | ---------- | ----------- | ------------------------ | ----------------------- |
     * | 越南       | Vietnam     | VNM                      | PP、DL、ID              |
     * | 印度       | India       | IND                      | PP                      |
     * | 菲律宾     | Philippines | PHL                      | PP、DL、ID(仅支持UUMID) |
     * | 阿尔巴尼亚 | Albania     | ALB                      | PP、DL、ID              |
     * | 巴西       | BRAZIL      | BRA                      | PP                      |
     * | 印度尼西亚 | INDONESIA   | IDN                      | PP                      |
     * | 马来西亚   | MALAYSIA    | MYS                      | PP                      |
     * | 尼日利亚   | NIGERIA     | NGA                      | PP                      |
     * | 巴基斯坦   | PAKISTAN    | PAK                      | PP                      |
     * | 俄罗斯     | RUSSIA      | RUS                      | PP(仅支持国际标准版本)  |
     * | 中国台湾   | TAIWAN      | TWN                      | PP                      |
     * | 乌克兰     | UKRAINE     | UKR                      | PP                      |
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdDocumentRequest 请求对象
     * @return AsyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse>
     */
    public AsyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse> recognizeIdDocumentAsyncInvoker(
        RecognizeIdDocumentRequest request) {
        return new AsyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse>(request,
            OcrMeta.recognizeIdDocument, hcClient);
    }

    /**
     * 保险单识别
     *
     * 识别保险单图片上的文字信息，并将识别的结构化结果返回给用户。支持对多板式保险单的扫描图片及手机照片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInsurancePolicyRequest 请求对象
     * @return CompletableFuture<RecognizeInsurancePolicyResponse>
     */
    public CompletableFuture<RecognizeInsurancePolicyResponse> recognizeInsurancePolicyAsync(
        RecognizeInsurancePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeInsurancePolicy);
    }

    /**
     * 保险单识别
     *
     * 识别保险单图片上的文字信息，并将识别的结构化结果返回给用户。支持对多板式保险单的扫描图片及手机照片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInsurancePolicyRequest 请求对象
     * @return AsyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse>
     */
    public AsyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> recognizeInsurancePolicyAsyncInvoker(
        RecognizeInsurancePolicyRequest request) {
        return new AsyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse>(request,
            OcrMeta.recognizeInsurancePolicy, hcClient);
    }

    /**
     * 发票验真
     *
     * 发票验真服务支持9种增值税发票的信息核验，包括增值税专用发票、增值税普通发票、增值税普通发票（卷式）、增值税电子专用发票、增值税电子普通发票、增值税电子普通发票（通行费）、二手车销售统一发票、机动车销售统一发票、区块链电子发票，支持返回票面的全部信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInvoiceVerificationRequest 请求对象
     * @return CompletableFuture<RecognizeInvoiceVerificationResponse>
     */
    public CompletableFuture<RecognizeInvoiceVerificationResponse> recognizeInvoiceVerificationAsync(
        RecognizeInvoiceVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeInvoiceVerification);
    }

    /**
     * 发票验真
     *
     * 发票验真服务支持9种增值税发票的信息核验，包括增值税专用发票、增值税普通发票、增值税普通发票（卷式）、增值税电子专用发票、增值税电子普通发票、增值税电子普通发票（通行费）、二手车销售统一发票、机动车销售统一发票、区块链电子发票，支持返回票面的全部信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInvoiceVerificationRequest 请求对象
     * @return AsyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse>
     */
    public AsyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> recognizeInvoiceVerificationAsyncInvoker(
        RecognizeInvoiceVerificationRequest request) {
        return new AsyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse>(request,
            OcrMeta.recognizeInvoiceVerification, hcClient);
    }

    /**
     * 车牌识别
     *
     * 识别输入图片中的车牌信息，并返回其坐标和内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return CompletableFuture<RecognizeLicensePlateResponse>
     */
    public CompletableFuture<RecognizeLicensePlateResponse> recognizeLicensePlateAsync(
        RecognizeLicensePlateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeLicensePlate);
    }

    /**
     * 车牌识别
     *
     * 识别输入图片中的车牌信息，并返回其坐标和内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>
     */
    public AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlateAsyncInvoker(
        RecognizeLicensePlateRequest request) {
        return new AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>(request,
            OcrMeta.recognizeLicensePlate, hcClient);
    }

    /**
     * 机动车销售发票识别
     *
     * 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeMvsInvoiceResponse>
     */
    public CompletableFuture<RecognizeMvsInvoiceResponse> recognizeMvsInvoiceAsync(RecognizeMvsInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMvsInvoice);
    }

    /**
     * 机动车销售发票识别
     *
     * 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>
     */
    public AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoiceAsyncInvoker(
        RecognizeMvsInvoiceRequest request) {
        return new AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>(request,
            OcrMeta.recognizeMvsInvoice, hcClient);
    }

    /**
     * 缅文驾驶证识别
     *
     * 识别缅甸驾驶证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarDriverLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeMyanmarDriverLicenseResponse>
     */
    public CompletableFuture<RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicenseAsync(
        RecognizeMyanmarDriverLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMyanmarDriverLicense);
    }

    /**
     * 缅文驾驶证识别
     *
     * 识别缅甸驾驶证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarDriverLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse>
     */
    public AsyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicenseAsyncInvoker(
        RecognizeMyanmarDriverLicenseRequest request) {
        return new AsyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse>(request,
            OcrMeta.recognizeMyanmarDriverLicense, hcClient);
    }

    /**
     * 缅文身份证识别
     *
     * 识别缅文身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarIdcardRequest 请求对象
     * @return CompletableFuture<RecognizeMyanmarIdcardResponse>
     */
    public CompletableFuture<RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcardAsync(
        RecognizeMyanmarIdcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMyanmarIdcard);
    }

    /**
     * 缅文身份证识别
     *
     * 识别缅文身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarIdcardRequest 请求对象
     * @return AsyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse>
     */
    public AsyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcardAsyncInvoker(
        RecognizeMyanmarIdcardRequest request) {
        return new AsyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse>(request,
            OcrMeta.recognizeMyanmarIdcard, hcClient);
    }

    /**
     * 护照识别
     *
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePassportRequest 请求对象
     * @return CompletableFuture<RecognizePassportResponse>
     */
    public CompletableFuture<RecognizePassportResponse> recognizePassportAsync(RecognizePassportRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizePassport);
    }

    /**
     * 护照识别
     *
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePassportRequest 请求对象
     * @return AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse>
     */
    public AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse> recognizePassportAsyncInvoker(
        RecognizePassportRequest request) {
        return new AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse>(request, OcrMeta.recognizePassport,
            hcClient);
    }

    /**
     * 核酸检测记录识别
     *
     * 识别核酸检测记录中的文字信息，并将识别的结构化结果返回给用户。PCR，全称Polymerase chain reaction,即聚合酶链式反应.PCR-test也为大众所认知为新型冠状病毒核酸检测测试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePcrTestRecordRequest 请求对象
     * @return CompletableFuture<RecognizePcrTestRecordResponse>
     */
    public CompletableFuture<RecognizePcrTestRecordResponse> recognizePcrTestRecordAsync(
        RecognizePcrTestRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizePcrTestRecord);
    }

    /**
     * 核酸检测记录识别
     *
     * 识别核酸检测记录中的文字信息，并将识别的结构化结果返回给用户。PCR，全称Polymerase chain reaction,即聚合酶链式反应.PCR-test也为大众所认知为新型冠状病毒核酸检测测试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePcrTestRecordRequest 请求对象
     * @return AsyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse>
     */
    public AsyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> recognizePcrTestRecordAsyncInvoker(
        RecognizePcrTestRecordRequest request) {
        return new AsyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse>(request,
            OcrMeta.recognizePcrTestRecord, hcClient);
    }

    /**
     * 从业资格证识别
     *
     * 识别道路运输从业资格证上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQualificationCertificateRequest 请求对象
     * @return CompletableFuture<RecognizeQualificationCertificateResponse>
     */
    public CompletableFuture<RecognizeQualificationCertificateResponse> recognizeQualificationCertificateAsync(
        RecognizeQualificationCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeQualificationCertificate);
    }

    /**
     * 从业资格证识别
     *
     * 识别道路运输从业资格证上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQualificationCertificateRequest 请求对象
     * @return AsyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse>
     */
    public AsyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> recognizeQualificationCertificateAsyncInvoker(
        RecognizeQualificationCertificateRequest request) {
        return new AsyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse>(
            request, OcrMeta.recognizeQualificationCertificate, hcClient);
    }

    /**
     * 定额发票识别
     *
     * 识别定额发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeQuotaInvoiceResponse>
     */
    public CompletableFuture<RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceAsync(
        RecognizeQuotaInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeQuotaInvoice);
    }

    /**
     * 定额发票识别
     *
     * 识别定额发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>
     */
    public AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceAsyncInvoker(
        RecognizeQuotaInvoiceRequest request) {
        return new AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>(request,
            OcrMeta.recognizeQuotaInvoice, hcClient);
    }

    /**
     * 出租车发票识别
     *
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeTaxiInvoiceResponse>
     */
    public CompletableFuture<RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceAsync(
        RecognizeTaxiInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTaxiInvoice);
    }

    /**
     * 出租车发票识别
     *
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>
     */
    public AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceAsyncInvoker(
        RecognizeTaxiInvoiceRequest request) {
        return new AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>(request,
            OcrMeta.recognizeTaxiInvoice, hcClient);
    }

    /**
     * 泰文身份证识别
     *
     * 识别泰国身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandIdcardRequest 请求对象
     * @return CompletableFuture<RecognizeThailandIdcardResponse>
     */
    public CompletableFuture<RecognizeThailandIdcardResponse> recognizeThailandIdcardAsync(
        RecognizeThailandIdcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeThailandIdcard);
    }

    /**
     * 泰文身份证识别
     *
     * 识别泰国身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandIdcardRequest 请求对象
     * @return AsyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse>
     */
    public AsyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> recognizeThailandIdcardAsyncInvoker(
        RecognizeThailandIdcardRequest request) {
        return new AsyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse>(request,
            OcrMeta.recognizeThailandIdcard, hcClient);
    }

    /**
     * 泰国车牌识别
     *
     * 识别泰国车牌图片中的车牌信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandLicensePlateRequest 请求对象
     * @return CompletableFuture<RecognizeThailandLicensePlateResponse>
     */
    public CompletableFuture<RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlateAsync(
        RecognizeThailandLicensePlateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeThailandLicensePlate);
    }

    /**
     * 泰国车牌识别
     *
     * 识别泰国车牌图片中的车牌信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandLicensePlateRequest 请求对象
     * @return AsyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse>
     */
    public AsyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlateAsyncInvoker(
        RecognizeThailandLicensePlateRequest request) {
        return new AsyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse>(request,
            OcrMeta.recognizeThailandLicensePlate, hcClient);
    }

    /**
     * 车辆通行费发票识别
     *
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeTollInvoiceResponse>
     */
    public CompletableFuture<RecognizeTollInvoiceResponse> recognizeTollInvoiceAsync(
        RecognizeTollInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTollInvoice);
    }

    /**
     * 车辆通行费发票识别
     *
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>
     */
    public AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoiceAsyncInvoker(
        RecognizeTollInvoiceRequest request) {
        return new AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>(request,
            OcrMeta.recognizeTollInvoice, hcClient);
    }

    /**
     * 火车票识别
     *
     * 识别火车票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return CompletableFuture<RecognizeTrainTicketResponse>
     */
    public CompletableFuture<RecognizeTrainTicketResponse> recognizeTrainTicketAsync(
        RecognizeTrainTicketRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTrainTicket);
    }

    /**
     * 火车票识别
     *
     * 识别火车票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>
     */
    public AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicketAsyncInvoker(
        RecognizeTrainTicketRequest request) {
        return new AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>(request,
            OcrMeta.recognizeTrainTicket, hcClient);
    }

    /**
     * 道路运输证识别
     *
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeTransportationLicenseResponse>
     */
    public CompletableFuture<RecognizeTransportationLicenseResponse> recognizeTransportationLicenseAsync(
        RecognizeTransportationLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTransportationLicense);
    }

    /**
     * 道路运输证识别
     *
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>
     */
    public AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicenseAsyncInvoker(
        RecognizeTransportationLicenseRequest request) {
        return new AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>(request,
            OcrMeta.recognizeTransportationLicense, hcClient);
    }

    /**
     * 增值税发票识别
     *
     * 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeVatInvoiceResponse>
     */
    public CompletableFuture<RecognizeVatInvoiceResponse> recognizeVatInvoiceAsync(RecognizeVatInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVatInvoice);
    }

    /**
     * 增值税发票识别
     *
     * 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>
     */
    public AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoiceAsyncInvoker(
        RecognizeVatInvoiceRequest request) {
        return new AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>(request,
            OcrMeta.recognizeVatInvoice, hcClient);
    }

    /**
     * 行驶证识别
     *
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeVehicleLicenseResponse>
     */
    public CompletableFuture<RecognizeVehicleLicenseResponse> recognizeVehicleLicenseAsync(
        RecognizeVehicleLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVehicleLicense);
    }

    /**
     * 行驶证识别
     *
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>
     */
    public AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicenseAsyncInvoker(
        RecognizeVehicleLicenseRequest request) {
        return new AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>(request,
            OcrMeta.recognizeVehicleLicense, hcClient);
    }

    /**
     * 电子面单识别
     *
     * 识别用户上传的韵达电子面单图片中的文字内容，并将识别的结果以json格式返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWaybillElectronicRequest 请求对象
     * @return CompletableFuture<RecognizeWaybillElectronicResponse>
     */
    public CompletableFuture<RecognizeWaybillElectronicResponse> recognizeWaybillElectronicAsync(
        RecognizeWaybillElectronicRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeWaybillElectronic);
    }

    /**
     * 电子面单识别
     *
     * 识别用户上传的韵达电子面单图片中的文字内容，并将识别的结果以json格式返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWaybillElectronicRequest 请求对象
     * @return AsyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse>
     */
    public AsyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> recognizeWaybillElectronicAsyncInvoker(
        RecognizeWaybillElectronicRequest request) {
        return new AsyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse>(request,
            OcrMeta.recognizeWaybillElectronic, hcClient);
    }

    /**
     * 网络图片识别
     *
     * 识别网络图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return CompletableFuture<RecognizeWebImageResponse>
     */
    public CompletableFuture<RecognizeWebImageResponse> recognizeWebImageAsync(RecognizeWebImageRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeWebImage);
    }

    /**
     * 网络图片识别
     *
     * 识别网络图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>
     */
    public AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImageAsyncInvoker(
        RecognizeWebImageRequest request) {
        return new AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>(request, OcrMeta.recognizeWebImage,
            hcClient);
    }

    /**
     * VIN码识别
     *
     * 识别图片中的车架号信息，并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVinRequest 请求对象
     * @return CompletableFuture<RecognizeVinResponse>
     */
    public CompletableFuture<RecognizeVinResponse> recognizeVinAsync(RecognizeVinRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVin);
    }

    /**
     * VIN码识别
     *
     * 识别图片中的车架号信息，并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVinRequest 请求对象
     * @return AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse>
     */
    public AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse> recognizeVinAsyncInvoker(
        RecognizeVinRequest request) {
        return new AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse>(request, OcrMeta.recognizeVin, hcClient);
    }

}
