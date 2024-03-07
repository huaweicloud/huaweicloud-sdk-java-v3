package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutAndUpdateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutAndUpdateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutAndUpdateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutAndUpdateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVODeleteByConditionVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveAllDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckInDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionReviseDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUndoCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListVersionModelVersionUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelSaveAsDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUniqueKeyDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestCountVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestSelectedVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestStaticsVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelCompareVersionVO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionCheckInDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionMasterDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionMasterModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionMasterQueryDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionReviseDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionUndoCheckOutDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;

@SuppressWarnings("unchecked")
public class IDMEClassicAPIMeta {

    public static final HttpRequestDef<BatchCheckinRequest, BatchCheckinResponse> batchCheckin = genForBatchCheckin();

    private static HttpRequestDef<BatchCheckinRequest, BatchCheckinResponse> genForBatchCheckin() {
        // basic
        HttpRequestDef.Builder<BatchCheckinRequest, BatchCheckinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckinRequest.class, BatchCheckinResponse.class)
                .withName("BatchCheckin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckinRequest::getIdentifier, BatchCheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckinRequest::getModelName, BatchCheckinRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckInDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckInDTO.class),
            f -> f.withMarshaller(BatchCheckinRequest::getBody, BatchCheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutRequest, BatchCheckoutResponse> batchCheckout =
        genForBatchCheckout();

    private static HttpRequestDef<BatchCheckoutRequest, BatchCheckoutResponse> genForBatchCheckout() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutRequest, BatchCheckoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckoutRequest.class, BatchCheckoutResponse.class)
                .withName("BatchCheckout")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutRequest::getIdentifier, BatchCheckoutRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutRequest::getModelName, BatchCheckoutRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckOutDTO.class),
            f -> f.withMarshaller(BatchCheckoutRequest::getBody, BatchCheckoutRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> batchCheckoutAndUpdate =
        genForBatchCheckoutAndUpdate();

    private static HttpRequestDef<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> genForBatchCheckoutAndUpdate() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCheckoutAndUpdateRequest.class, BatchCheckoutAndUpdateResponse.class)
            .withName("BatchCheckoutAndUpdate")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCheckoutAndUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutAndUpdateRequest::getIdentifier,
                BatchCheckoutAndUpdateRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutAndUpdateRequest::getModelName,
                BatchCheckoutAndUpdateRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionCheckoutAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(BatchCheckoutAndUpdateRequest::getBody, BatchCheckoutAndUpdateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> batchCheckoutUndo =
        genForBatchCheckoutUndo();

    private static HttpRequestDef<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> genForBatchCheckoutUndo() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckoutUndoRequest.class, BatchCheckoutUndoResponse.class)
                .withName("BatchCheckoutUndo")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUndoCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoRequest::getIdentifier, BatchCheckoutUndoRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoRequest::getModelName, BatchCheckoutUndoRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(BatchCheckoutUndoRequest::getBody, BatchCheckoutUndoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> batchCheckoutUndoByAdmin =
        genForBatchCheckoutUndoByAdmin();

    private static HttpRequestDef<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> genForBatchCheckoutUndoByAdmin() {
        // basic
        HttpRequestDef.Builder<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchCheckoutUndoByAdminRequest.class, BatchCheckoutUndoByAdminResponse.class)
                .withName("BatchCheckoutUndoByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUndoCheckoutByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoByAdminRequest::getIdentifier,
                BatchCheckoutUndoByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCheckoutUndoByAdminRequest::getModelName,
                BatchCheckoutUndoByAdminRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(BatchCheckoutUndoByAdminRequest::getBody, BatchCheckoutUndoByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPost =
        genForBatchCreateUsingPost();

    private static HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> genForBatchCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateUsingPostRequest.class, BatchCreateUsingPostResponse.class)
            .withName("BatchCreateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCreate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getIdentifier,
                BatchCreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getModelName,
                BatchCreateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelCreateDTO.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getBody, BatchCreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranch =
        genForBatchDeleteBranch();

    private static HttpRequestDef<BatchDeleteBranchRequest, BatchDeleteBranchResponse> genForBatchDeleteBranch() {
        // basic
        HttpRequestDef.Builder<BatchDeleteBranchRequest, BatchDeleteBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteBranchRequest.class, BatchDeleteBranchResponse.class)
                .withName("BatchDeleteBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getIdentifier, BatchDeleteBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getModelName, BatchDeleteBranchRequest::setModelName));
        builder.<RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(BatchDeleteBranchRequest::getBody, BatchDeleteBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> batchDeleteLogicalBranch =
        genForBatchDeleteLogicalBranch();

    private static HttpRequestDef<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> genForBatchDeleteLogicalBranch() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteLogicalBranchRequest.class, BatchDeleteLogicalBranchResponse.class)
                .withName("BatchDeleteLogicalBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalBranchRequest::getIdentifier,
                BatchDeleteLogicalBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalBranchRequest::getModelName,
                BatchDeleteLogicalBranchRequest::setModelName));
        builder.<RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionMasterIdsDtoVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalBranchRequest::getBody, BatchDeleteLogicalBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPost =
        genForBatchDeleteLogicalUsingPost();

    private static HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> genForBatchDeleteLogicalUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteLogicalUsingPostRequest.class,
                    BatchDeleteLogicalUsingPostResponse.class)
                .withName("BatchDeleteLogicalUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getIdentifier,
                BatchDeleteLogicalUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getModelName,
                BatchDeleteLogicalUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getBody,
                BatchDeleteLogicalUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPost =
        genForBatchDeleteUsingPost();

    private static HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> genForBatchDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteUsingPostRequest.class, BatchDeleteUsingPostResponse.class)
            .withName("BatchDeleteUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDelete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getIdentifier,
                BatchDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getModelName,
                BatchDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getBody, BatchDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchExecuteReviseRequest, BatchExecuteReviseResponse> batchExecuteRevise =
        genForBatchExecuteRevise();

    private static HttpRequestDef<BatchExecuteReviseRequest, BatchExecuteReviseResponse> genForBatchExecuteRevise() {
        // basic
        HttpRequestDef.Builder<BatchExecuteReviseRequest, BatchExecuteReviseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchExecuteReviseRequest.class, BatchExecuteReviseResponse.class)
                .withName("BatchExecuteRevise")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchRevise")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteReviseRequest::getIdentifier, BatchExecuteReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteReviseRequest::getModelName, BatchExecuteReviseRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionReviseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionReviseDTO.class),
            f -> f.withMarshaller(BatchExecuteReviseRequest::getBody, BatchExecuteReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPost =
        genForBatchShowGetUsingPost();

    private static HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> genForBatchShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchShowGetUsingPostRequest.class, BatchShowGetUsingPostResponse.class)
            .withName("BatchShowGetUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchGet")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getIdentifier,
                BatchShowGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getModelName,
                BatchShowGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdsDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsDecryptDTO.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getBody, BatchShowGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> batchUpdateAndCheckin =
        genForBatchUpdateAndCheckin();

    private static HttpRequestDef<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> genForBatchUpdateAndCheckin() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateAndCheckinRequest.class, BatchUpdateAndCheckinResponse.class)
            .withName("BatchUpdateAndCheckin")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateAndCheckin")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndCheckinRequest::getIdentifier,
                BatchUpdateAndCheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndCheckinRequest::getModelName,
                BatchUpdateAndCheckinRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUpdateAndCheckinDTOVersionModel.class),
            f -> f.withMarshaller(BatchUpdateAndCheckinRequest::getBody, BatchUpdateAndCheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> batchUpdateAndRevise =
        genForBatchUpdateAndRevise();

    private static HttpRequestDef<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> genForBatchUpdateAndRevise() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateAndReviseRequest.class, BatchUpdateAndReviseResponse.class)
            .withName("BatchUpdateAndRevise")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchReviseAndUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndReviseRequest::getIdentifier,
                BatchUpdateAndReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAndReviseRequest::getModelName,
                BatchUpdateAndReviseRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionReviseAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(BatchUpdateAndReviseRequest::getBody, BatchUpdateAndReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> batchUpdateByAdmin =
        genForBatchUpdateByAdmin();

    private static HttpRequestDef<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> genForBatchUpdateByAdmin() {
        // basic
        HttpRequestDef.Builder<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateByAdminRequest.class, BatchUpdateByAdminResponse.class)
                .withName("BatchUpdateByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateByAdminRequest::getIdentifier, BatchUpdateByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateByAdminRequest::getModelName, BatchUpdateByAdminRequest::setModelName));
        builder.<RDMParamVOListVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModel.class),
            f -> f.withMarshaller(BatchUpdateByAdminRequest::getBody, BatchUpdateByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPost =
        genForBatchUpdateUsingPost();

    private static HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> genForBatchUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateUsingPostRequest.class, BatchUpdateUsingPostResponse.class)
            .withName("BatchUpdateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getIdentifier,
                BatchUpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getModelName,
                BatchUpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getBody, BatchUpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateVersionRequest, BatchUpdateVersionResponse> batchUpdateVersion =
        genForBatchUpdateVersion();

    private static HttpRequestDef<BatchUpdateVersionRequest, BatchUpdateVersionResponse> genForBatchUpdateVersion() {
        // basic
        HttpRequestDef.Builder<BatchUpdateVersionRequest, BatchUpdateVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateVersionRequest.class, BatchUpdateVersionResponse.class)
                .withName("BatchUpdateVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdateVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateVersionRequest::getIdentifier, BatchUpdateVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateVersionRequest::getModelName, BatchUpdateVersionRequest::setModelName));
        builder.<RDMParamVOListVersionModelVersionUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListVersionModelVersionUpdateDTO.class),
            f -> f.withMarshaller(BatchUpdateVersionRequest::getBody, BatchUpdateVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckinRequest, CheckinResponse> checkin = genForCheckin();

    private static HttpRequestDef<CheckinRequest, CheckinResponse> genForCheckin() {
        // basic
        HttpRequestDef.Builder<CheckinRequest, CheckinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckinRequest.class, CheckinResponse.class)
                .withName("Checkin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckinRequest::getIdentifier, CheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckinRequest::getModelName, CheckinRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckInDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckInDTO.class),
            f -> f.withMarshaller(CheckinRequest::getBody, CheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutRequest, CheckoutResponse> checkout = genForCheckout();

    private static HttpRequestDef<CheckoutRequest, CheckoutResponse> genForCheckout() {
        // basic
        HttpRequestDef.Builder<CheckoutRequest, CheckoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutRequest.class, CheckoutResponse.class)
                .withName("Checkout")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutRequest::getIdentifier, CheckoutRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutRequest::getModelName, CheckoutRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckOutDTO.class),
            f -> f.withMarshaller(CheckoutRequest::getBody, CheckoutRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> checkoutAndUpdate =
        genForCheckoutAndUpdate();

    private static HttpRequestDef<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> genForCheckoutAndUpdate() {
        // basic
        HttpRequestDef.Builder<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutAndUpdateRequest.class, CheckoutAndUpdateResponse.class)
                .withName("CheckoutAndUpdate")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/checkoutAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutAndUpdateRequest::getIdentifier, CheckoutAndUpdateRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutAndUpdateRequest::getModelName, CheckoutAndUpdateRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionCheckoutAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(CheckoutAndUpdateRequest::getBody, CheckoutAndUpdateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutUndoRequest, CheckoutUndoResponse> checkoutUndo = genForCheckoutUndo();

    private static HttpRequestDef<CheckoutUndoRequest, CheckoutUndoResponse> genForCheckoutUndo() {
        // basic
        HttpRequestDef.Builder<CheckoutUndoRequest, CheckoutUndoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutUndoRequest.class, CheckoutUndoResponse.class)
                .withName("CheckoutUndo")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/undoCheckout")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoRequest::getIdentifier, CheckoutUndoRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoRequest::getModelName, CheckoutUndoRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(CheckoutUndoRequest::getBody, CheckoutUndoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> checkoutUndoByAdmin =
        genForCheckoutUndoByAdmin();

    private static HttpRequestDef<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> genForCheckoutUndoByAdmin() {
        // basic
        HttpRequestDef.Builder<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckoutUndoByAdminRequest.class, CheckoutUndoByAdminResponse.class)
                .withName("CheckoutUndoByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/undoCheckoutByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoByAdminRequest::getIdentifier,
                CheckoutUndoByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckoutUndoByAdminRequest::getModelName, CheckoutUndoByAdminRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUndoCheckOutDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUndoCheckOutDTO.class),
            f -> f.withMarshaller(CheckoutUndoByAdminRequest::getBody, CheckoutUndoByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareBusinessVersionRequest, CompareBusinessVersionResponse> compareBusinessVersion =
        genForCompareBusinessVersion();

    private static HttpRequestDef<CompareBusinessVersionRequest, CompareBusinessVersionResponse> genForCompareBusinessVersion() {
        // basic
        HttpRequestDef.Builder<CompareBusinessVersionRequest, CompareBusinessVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CompareBusinessVersionRequest.class, CompareBusinessVersionResponse.class)
            .withName("CompareBusinessVersion")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/compareBusinessVersion")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareBusinessVersionRequest::getIdentifier,
                CompareBusinessVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareBusinessVersionRequest::getModelName,
                CompareBusinessVersionRequest::setModelName));
        builder.<RDMParamVOVersionModelCompareVersionVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelCompareVersionVO.class),
            f -> f.withMarshaller(CompareBusinessVersionRequest::getBody, CompareBusinessVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> countUsingPost =
        genForCountUsingPost();

    private static HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> genForCountUsingPost() {
        // basic
        HttpRequestDef.Builder<CountUsingPostRequest, CountUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountUsingPostRequest.class, CountUsingPostResponse.class)
                .withName("CountUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getIdentifier, CountUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getModelName, CountUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestCountVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestCountVo.class),
            f -> f.withMarshaller(CountUsingPostRequest::getBody, CountUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPost =
        genForCreateUsingPost();

    private static HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> genForCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<CreateUsingPostRequest, CreateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUsingPostRequest.class, CreateUsingPostResponse.class)
                .withName("CreateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getIdentifier, CreateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getModelName, CreateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelCreateDTO.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getBody, CreateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBranchRequest, DeleteBranchResponse> deleteBranch = genForDeleteBranch();

    private static HttpRequestDef<DeleteBranchRequest, DeleteBranchResponse> genForDeleteBranch() {
        // basic
        HttpRequestDef.Builder<DeleteBranchRequest, DeleteBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteBranchRequest.class, DeleteBranchResponse.class)
                .withName("DeleteBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBranchRequest::getIdentifier, DeleteBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBranchRequest::getModelName, DeleteBranchRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteBranchRequest::getBody, DeleteBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPost =
        genForDeleteByConditionUsingPost();

    private static HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> genForDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteByConditionUsingPostRequest.class,
                    DeleteByConditionUsingPostResponse.class)
                .withName("DeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getIdentifier,
                DeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getModelName,
                DeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getBody,
                DeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLatestVersionRequest, DeleteLatestVersionResponse> deleteLatestVersion =
        genForDeleteLatestVersion();

    private static HttpRequestDef<DeleteLatestVersionRequest, DeleteLatestVersionResponse> genForDeleteLatestVersion() {
        // basic
        HttpRequestDef.Builder<DeleteLatestVersionRequest, DeleteLatestVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteLatestVersionRequest.class, DeleteLatestVersionResponse.class)
                .withName("DeleteLatestVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteLatestVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLatestVersionRequest::getIdentifier,
                DeleteLatestVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLatestVersionRequest::getModelName, DeleteLatestVersionRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteLatestVersionRequest::getBody, DeleteLatestVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> deleteLogicalBranch =
        genForDeleteLogicalBranch();

    private static HttpRequestDef<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> genForDeleteLogicalBranch() {
        // basic
        HttpRequestDef.Builder<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteLogicalBranchRequest.class, DeleteLogicalBranchResponse.class)
                .withName("DeleteLogicalBranch")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteBranch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalBranchRequest::getIdentifier,
                DeleteLogicalBranchRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalBranchRequest::getModelName, DeleteLogicalBranchRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteLogicalBranchRequest::getBody, DeleteLogicalBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> deleteLogicalLatestVersion =
        genForDeleteLogicalLatestVersion();

    private static HttpRequestDef<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> genForDeleteLogicalLatestVersion() {
        // basic
        HttpRequestDef.Builder<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteLogicalLatestVersionRequest.class,
                    DeleteLogicalLatestVersionResponse.class)
                .withName("DeleteLogicalLatestVersion")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteLatestVersion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalLatestVersionRequest::getIdentifier,
                DeleteLogicalLatestVersionRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogicalLatestVersionRequest::getModelName,
                DeleteLogicalLatestVersionRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterModifierDTO.class),
            f -> f.withMarshaller(DeleteLogicalLatestVersionRequest::getBody,
                DeleteLogicalLatestVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPost =
        genForDeleteUsingPost();

    private static HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> genForDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteUsingPostRequest, DeleteUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteUsingPostRequest.class, DeleteUsingPostResponse.class)
                .withName("DeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getIdentifier, DeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getModelName, DeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getBody, DeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteReviseRequest, ExecuteReviseResponse> executeRevise =
        genForExecuteRevise();

    private static HttpRequestDef<ExecuteReviseRequest, ExecuteReviseResponse> genForExecuteRevise() {
        // basic
        HttpRequestDef.Builder<ExecuteReviseRequest, ExecuteReviseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteReviseRequest.class, ExecuteReviseResponse.class)
                .withName("ExecuteRevise")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/revise")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteReviseRequest::getIdentifier, ExecuteReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteReviseRequest::getModelName, ExecuteReviseRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionReviseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionReviseDTO.class),
            f -> f.withMarshaller(ExecuteReviseRequest::getBody, ExecuteReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllVersionsRequest, ListAllVersionsResponse> listAllVersions =
        genForListAllVersions();

    private static HttpRequestDef<ListAllVersionsRequest, ListAllVersionsResponse> genForListAllVersions() {
        // basic
        HttpRequestDef.Builder<ListAllVersionsRequest, ListAllVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllVersionsRequest.class, ListAllVersionsResponse.class)
                .withName("ListAllVersions")
                .withUri(
                    "/rdm_{identifier}_app/publicservices/api/{modelName}/getAllVersions/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getIdentifier, ListAllVersionsRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getModelName, ListAllVersionsRequest::setModelName));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getCurPagePath, ListAllVersionsRequest::setCurPagePath));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getPageSizePath, ListAllVersionsRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getCurPage, ListAllVersionsRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getEndIndex, ListAllVersionsRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getMaxPageSize, ListAllVersionsRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getPageSize, ListAllVersionsRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getStartIndex, ListAllVersionsRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getTotalPages, ListAllVersionsRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getTotalRows, ListAllVersionsRequest::setTotalRows));
        builder.<RDMParamVOVersionModelVersionMasterDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterDTO.class),
            f -> f.withMarshaller(ListAllVersionsRequest::getBody, ListAllVersionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPost =
        genForListQueryUsingPost();

    private static HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> genForListQueryUsingPost() {
        // basic
        HttpRequestDef.Builder<ListQueryUsingPostRequest, ListQueryUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryUsingPostRequest.class, ListQueryUsingPostResponse.class)
                .withName("ListQueryUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/query/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getIdentifier, ListQueryUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getModelName, ListQueryUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSizePath,
                ListQueryUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPagePath,
                ListQueryUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPage, ListQueryUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getEndIndex, ListQueryUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getMaxPageSize,
                ListQueryUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSize, ListQueryUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getStartIndex, ListQueryUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalPages, ListQueryUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalRows, ListQueryUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getBody, ListQueryUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPost =
        genForListSelectUsingPost();

    private static HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> genForListSelectUsingPost() {
        // basic
        HttpRequestDef.Builder<ListSelectUsingPostRequest, ListSelectUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSelectUsingPostRequest.class, ListSelectUsingPostResponse.class)
                .withName("ListSelectUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/select/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getIdentifier,
                ListSelectUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getModelName, ListSelectUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSizePath,
                ListSelectUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPagePath,
                ListSelectUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPage, ListSelectUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getEndIndex, ListSelectUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getMaxPageSize,
                ListSelectUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSize, ListSelectUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getStartIndex,
                ListSelectUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalPages,
                ListSelectUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalRows, ListSelectUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestSelectedVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestSelectedVo.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getBody, ListSelectUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> listUsingPost =
        genForListUsingPost();

    private static HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> genForListUsingPost() {
        // basic
        HttpRequestDef.Builder<ListUsingPostRequest, ListUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUsingPostRequest.class, ListUsingPostResponse.class)
                .withName("ListUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/list/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getIdentifier, ListUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getModelName, ListUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSizePath, ListUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPagePath, ListUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPage, ListUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getEndIndex, ListUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getMaxPageSize, ListUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSize, ListUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getStartIndex, ListUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalPages, ListUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalRows, ListUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListUsingPostRequest::getBody, ListUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPost =
        genForSaveAllUsingPost();

    private static HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> genForSaveAllUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAllUsingPostRequest, SaveAllUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAllUsingPostRequest.class, SaveAllUsingPostResponse.class)
                .withName("SaveAllUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAll")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getIdentifier, SaveAllUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getModelName, SaveAllUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveAllDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveAllDTO.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getBody, SaveAllUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPost =
        genForSaveAsUsingPost();

    private static HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> genForSaveAsUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAsUsingPostRequest, SaveAsUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAsUsingPostRequest.class, SaveAsUsingPostResponse.class)
                .withName("SaveAsUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getIdentifier, SaveAsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getModelName, SaveAsUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelSaveAsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelSaveAsDTO.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getBody, SaveAsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPost =
        genForSaveUsingPost();

    private static HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> genForSaveUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveUsingPostRequest, SaveUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveUsingPostRequest.class, SaveUsingPostResponse.class)
                .withName("SaveUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getIdentifier, SaveUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getModelName, SaveUsingPostRequest::setModelName));
        builder.<RDMParamVOListPersistableModelSaveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveDTO.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getBody, SaveUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPost =
        genForShowFindUsingPost();

    private static HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> genForShowFindUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowFindUsingPostRequest, ShowFindUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFindUsingPostRequest.class, ShowFindUsingPostResponse.class)
                .withName("ShowFindUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/find/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getIdentifier, ShowFindUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getModelName, ShowFindUsingPostRequest::setModelName));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSizePath,
                ShowFindUsingPostRequest::setPageSizePath));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPagePath, ShowFindUsingPostRequest::setCurPagePath));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPage, ShowFindUsingPostRequest::setCurPage));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getEndIndex, ShowFindUsingPostRequest::setEndIndex));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getMaxPageSize, ShowFindUsingPostRequest::setMaxPageSize));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSize, ShowFindUsingPostRequest::setPageSize));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getStartIndex, ShowFindUsingPostRequest::setStartIndex));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalPages, ShowFindUsingPostRequest::setTotalPages));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalRows, ShowFindUsingPostRequest::setTotalRows));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getBody, ShowFindUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKey =
        genForShowGetByUniqueKey();

    private static HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> genForShowGetByUniqueKey() {
        // basic
        HttpRequestDef.Builder<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetByUniqueKeyRequest.class, ShowGetByUniqueKeyResponse.class)
                .withName("ShowGetByUniqueKey")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/{getUniqueFieldMethod}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getIdentifier, ShowGetByUniqueKeyRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getModelName, ShowGetByUniqueKeyRequest::setModelName));
        builder.<String>withRequestField("getUniqueFieldMethod",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getGetUniqueFieldMethod,
                ShowGetByUniqueKeyRequest::setGetUniqueFieldMethod));
        builder.<RDMParamVOPersistableModelUniqueKeyDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUniqueKeyDTO.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getBody, ShowGetByUniqueKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPost =
        genForShowGetUsingPost();

    private static HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> genForShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetUsingPostRequest, ShowGetUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetUsingPostRequest.class, ShowGetUsingPostResponse.class)
                .withName("ShowGetUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getIdentifier, ShowGetUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getModelName, ShowGetUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdDecryptDTO.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getBody, ShowGetUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPost =
        genForShowLogicalDeleteByConditionUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> genForShowLogicalDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteByConditionUsingPostRequest.class,
                    ShowLogicalDeleteByConditionUsingPostResponse.class)
                .withName("ShowLogicalDeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getIdentifier,
                ShowLogicalDeleteByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getModelName,
                ShowLogicalDeleteByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getBody,
                ShowLogicalDeleteByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPost =
        genForShowLogicalDeleteUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> genForShowLogicalDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteUsingPostRequest.class,
                    ShowLogicalDeleteUsingPostResponse.class)
                .withName("ShowLogicalDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getIdentifier,
                ShowLogicalDeleteUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getModelName,
                ShowLogicalDeleteUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getBody,
                ShowLogicalDeleteUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPost =
        genForShowStaticsUsingPost();

    private static HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> genForShowStaticsUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowStaticsUsingPostRequest.class, ShowStaticsUsingPostResponse.class)
            .withName("ShowStaticsUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/statics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getIdentifier,
                ShowStaticsUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getModelName,
                ShowStaticsUsingPostRequest::setModelName));
        builder.<RDMParamVOQueryRequestStaticsVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestStaticsVo.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getBody, ShowStaticsUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionByMasterRequest, ShowVersionByMasterResponse> showVersionByMaster =
        genForShowVersionByMaster();

    private static HttpRequestDef<ShowVersionByMasterRequest, ShowVersionByMasterResponse> genForShowVersionByMaster() {
        // basic
        HttpRequestDef.Builder<ShowVersionByMasterRequest, ShowVersionByMasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowVersionByMasterRequest.class, ShowVersionByMasterResponse.class)
                .withName("ShowVersionByMaster")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/getVersionByMaster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionByMasterRequest::getIdentifier,
                ShowVersionByMasterRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionByMasterRequest::getModelName, ShowVersionByMasterRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionMasterQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionMasterQueryDTO.class),
            f -> f.withMarshaller(ShowVersionByMasterRequest::getBody, ShowVersionByMasterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAndCheckinRequest, UpdateAndCheckinResponse> updateAndCheckin =
        genForUpdateAndCheckin();

    private static HttpRequestDef<UpdateAndCheckinRequest, UpdateAndCheckinResponse> genForUpdateAndCheckin() {
        // basic
        HttpRequestDef.Builder<UpdateAndCheckinRequest, UpdateAndCheckinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAndCheckinRequest.class, UpdateAndCheckinResponse.class)
                .withName("UpdateAndCheckin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateAndCheckin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndCheckinRequest::getIdentifier, UpdateAndCheckinRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndCheckinRequest::getModelName, UpdateAndCheckinRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionUpdateAndCheckinDTOVersionModel.class),
            f -> f.withMarshaller(UpdateAndCheckinRequest::getBody, UpdateAndCheckinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAndReviseRequest, UpdateAndReviseResponse> updateAndRevise =
        genForUpdateAndRevise();

    private static HttpRequestDef<UpdateAndReviseRequest, UpdateAndReviseResponse> genForUpdateAndRevise() {
        // basic
        HttpRequestDef.Builder<UpdateAndReviseRequest, UpdateAndReviseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAndReviseRequest.class, UpdateAndReviseResponse.class)
                .withName("UpdateAndRevise")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/reviseAndUpdate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndReviseRequest::getIdentifier, UpdateAndReviseRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAndReviseRequest::getModelName, UpdateAndReviseRequest::setModelName));
        builder.<RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelVersionReviseAndUpdateDTOVersionModel.class),
            f -> f.withMarshaller(UpdateAndReviseRequest::getBody, UpdateAndReviseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateByAdminRequest, UpdateByAdminResponse> updateByAdmin =
        genForUpdateByAdmin();

    private static HttpRequestDef<UpdateByAdminRequest, UpdateByAdminResponse> genForUpdateByAdmin() {
        // basic
        HttpRequestDef.Builder<UpdateByAdminRequest, UpdateByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateByAdminRequest.class, UpdateByAdminResponse.class)
                .withName("UpdateByAdmin")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByAdmin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByAdminRequest::getIdentifier, UpdateByAdminRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByAdminRequest::getModelName, UpdateByAdminRequest::setModelName));
        builder.<RDMParamVOVersionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModel.class),
            f -> f.withMarshaller(UpdateByAdminRequest::getBody, UpdateByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPost =
        genForUpdateByConditionUsingPost();

    private static HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> genForUpdateByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateByConditionUsingPostRequest.class,
                    UpdateByConditionUsingPostResponse.class)
                .withName("UpdateByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getIdentifier,
                UpdateByConditionUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getModelName,
                UpdateByConditionUsingPostRequest::setModelName));
        builder.<RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getBody,
                UpdateByConditionUsingPostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPost =
        genForUpdateUsingPost();

    private static HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> genForUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateUsingPostRequest, UpdateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateUsingPostRequest.class, UpdateUsingPostResponse.class)
                .withName("UpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getIdentifier, UpdateUsingPostRequest::setIdentifier));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getModelName, UpdateUsingPostRequest::setModelName));
        builder.<RDMParamVOPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getBody, UpdateUsingPostRequest::setBody));

        // response

        return builder.build();
    }

}
