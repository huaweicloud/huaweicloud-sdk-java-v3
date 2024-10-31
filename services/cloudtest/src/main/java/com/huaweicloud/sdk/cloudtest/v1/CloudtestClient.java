package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddResourcesForIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddResourcesForIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteFacotrByIdsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteFacotrByIdsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchRemoveTestCasesFromIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchRemoveTestCasesFromIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchUpdateVersionTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchUpdateVersionTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBackupMindmapRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBackupMindmapResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateProjectBranchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateProjectBranchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateUserDefinedUrlKeyWordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateUserDefinedUrlKeyWordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateVersionTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateVersionTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteBasicAwByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteBasicAwByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteFacotrByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteFacotrByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapBackupByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapBackupByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapRecycleByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapRecycleByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTemplateByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTemplateByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DownloadAssetTemplateRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DownloadAssetTemplateResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ExportFactorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ExportFactorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlarmStatisticsUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlarmStatisticsUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAvailableConfigRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAvailableConfigResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwInfoListSupportsSearchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwInfoListSupportsSearchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListCasesStatusRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListCasesStatusResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListDomainVisibleServicesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListDomainVisibleServicesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListLinesUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListLinesUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListMsgInfosUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListMsgInfosUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListOwnTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListOwnTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListScattersUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListScattersUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListSubTaskCaseOverstockUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListSubTaskCaseOverstockUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskAssignCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskAssignCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTasksRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTasksResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseCommentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseCommentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseScriptDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseScriptDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesByIssueRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesByIssueResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsingGetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsingGetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesFromIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesFromIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBranchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBranchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowCaseResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowConcurrencyPackageUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowConcurrencyPackageUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDefaultTemplateByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDefaultTemplateByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowEchoTestPackageUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowEchoTestPackageUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByAssetIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByAssetIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindMapByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindMapByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowOperationalDataCurrentMonthUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowOperationalDataCurrentMonthUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReviewByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReviewByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSceneByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSceneByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowStatisticByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowStatisticByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseReviewsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseReviewsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCasesChangeStatisticsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCasesChangeStatisticsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestpointByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestpointByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateMindmapNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateMindmapNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseAndScriptRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseAndScriptResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateVersionTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateVersionTestCaseResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudtestClient {

    protected HcClient hcClient;

    public CloudtestClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestClient> newBuilder() {
        ClientBuilder<CloudtestClient> clientBuilder = new ClientBuilder<>(CloudtestClient::new);
        return clientBuilder;
    }

    /**
     * 新增用例评论
     *
     * 新增用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTestCaseCommentRequest 请求对象
     * @return AddTestCaseCommentResponse
     */
    public AddTestCaseCommentResponse addTestCaseComment(AddTestCaseCommentRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.addTestCaseComment);
    }

    /**
     * 新增用例评论
     *
     * 新增用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTestCaseCommentRequest 请求对象
     * @return SyncInvoker<AddTestCaseCommentRequest, AddTestCaseCommentResponse>
     */
    public SyncInvoker<AddTestCaseCommentRequest, AddTestCaseCommentResponse> addTestCaseCommentInvoker(
        AddTestCaseCommentRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.addTestCaseComment, hcClient);
    }

    /**
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return BatchAddRelationsByOneCaseResponse
     */
    public BatchAddRelationsByOneCaseResponse batchAddRelationsByOneCase(BatchAddRelationsByOneCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchAddRelationsByOneCase);
    }

    /**
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return SyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse>
     */
    public SyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCaseInvoker(
        BatchAddRelationsByOneCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchAddRelationsByOneCase, hcClient);
    }

    /**
     * 向迭代中添加资源
     *
     * 向迭代中添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourcesForIteratorRequest 请求对象
     * @return BatchAddResourcesForIteratorResponse
     */
    public BatchAddResourcesForIteratorResponse batchAddResourcesForIterator(
        BatchAddResourcesForIteratorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchAddResourcesForIterator);
    }

    /**
     * 向迭代中添加资源
     *
     * 向迭代中添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourcesForIteratorRequest 请求对象
     * @return SyncInvoker<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse>
     */
    public SyncInvoker<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse> batchAddResourcesForIteratorInvoker(
        BatchAddResourcesForIteratorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchAddResourcesForIterator, hcClient);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return BatchDeleteTestCaseResponse
     */
    public BatchDeleteTestCaseResponse batchDeleteTestCase(BatchDeleteTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseInvoker(
        BatchDeleteTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchDeleteTestCase, hcClient);
    }

    /**
     * 批量删除用例
     *
     * 批量删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCasesRequest 请求对象
     * @return BatchDeleteTestCasesResponse
     */
    public BatchDeleteTestCasesResponse batchDeleteTestCases(BatchDeleteTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestCases);
    }

    /**
     * 批量删除用例
     *
     * 批量删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCasesRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse>
     */
    public SyncInvoker<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse> batchDeleteTestCasesInvoker(
        BatchDeleteTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchDeleteTestCases, hcClient);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return BatchDeleteTestReportResponse
     */
    public BatchDeleteTestReportResponse batchDeleteTestReport(BatchDeleteTestReportRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestReport);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse>
     */
    public SyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> batchDeleteTestReportInvoker(
        BatchDeleteTestReportRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchDeleteTestReport, hcClient);
    }

    /**
     * 从迭代中批量移除用例
     *
     * 从迭代中批量移除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveTestCasesFromIteratorRequest 请求对象
     * @return BatchRemoveTestCasesFromIteratorResponse
     */
    public BatchRemoveTestCasesFromIteratorResponse batchRemoveTestCasesFromIterator(
        BatchRemoveTestCasesFromIteratorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchRemoveTestCasesFromIterator);
    }

    /**
     * 从迭代中批量移除用例
     *
     * 从迭代中批量移除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveTestCasesFromIteratorRequest 请求对象
     * @return SyncInvoker<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse>
     */
    public SyncInvoker<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse> batchRemoveTestCasesFromIteratorInvoker(
        BatchRemoveTestCasesFromIteratorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchRemoveTestCasesFromIterator, hcClient);
    }

    /**
     * 批量更新用例属性
     *
     * 批量更新用例属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionTestCasesRequest 请求对象
     * @return BatchUpdateVersionTestCasesResponse
     */
    public BatchUpdateVersionTestCasesResponse batchUpdateVersionTestCases(BatchUpdateVersionTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchUpdateVersionTestCases);
    }

    /**
     * 批量更新用例属性
     *
     * 批量更新用例属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionTestCasesRequest 请求对象
     * @return SyncInvoker<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse>
     */
    public SyncInvoker<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse> batchUpdateVersionTestCasesInvoker(
        BatchUpdateVersionTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchUpdateVersionTestCases, hcClient);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return CheckPermissionResponse
     */
    public CheckPermissionResponse checkPermission(CheckPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.checkPermission);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return SyncInvoker<CheckPermissionRequest, CheckPermissionResponse>
     */
    public SyncInvoker<CheckPermissionRequest, CheckPermissionResponse> checkPermissionInvoker(
        CheckPermissionRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.checkPermission, hcClient);
    }

    /**
     * 新增迭代
     *
     * 新增迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIteratorRequest 请求对象
     * @return CreateIteratorResponse
     */
    public CreateIteratorResponse createIterator(CreateIteratorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createIterator);
    }

    /**
     * 新增迭代
     *
     * 新增迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIteratorRequest 请求对象
     * @return SyncInvoker<CreateIteratorRequest, CreateIteratorResponse>
     */
    public SyncInvoker<CreateIteratorRequest, CreateIteratorResponse> createIteratorInvoker(
        CreateIteratorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createIterator, hcClient);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return CreatePlanResponse
     */
    public CreatePlanResponse createPlan(CreatePlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return SyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public SyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanInvoker(CreatePlanRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createPlan, hcClient);
    }

    /**
     * 新增分支
     *
     * 新增分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectBranchRequest 请求对象
     * @return CreateProjectBranchResponse
     */
    public CreateProjectBranchResponse createProjectBranch(CreateProjectBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createProjectBranch);
    }

    /**
     * 新增分支
     *
     * 新增分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectBranchRequest 请求对象
     * @return SyncInvoker<CreateProjectBranchRequest, CreateProjectBranchResponse>
     */
    public SyncInvoker<CreateProjectBranchRequest, CreateProjectBranchResponse> createProjectBranchInvoker(
        CreateProjectBranchRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createProjectBranch, hcClient);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return CreateRelationsByOneCaseResponse
     */
    public CreateRelationsByOneCaseResponse createRelationsByOneCase(CreateRelationsByOneCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createRelationsByOneCase);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return SyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse>
     */
    public SyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> createRelationsByOneCaseInvoker(
        CreateRelationsByOneCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createRelationsByOneCase, hcClient);
    }

    /**
     * 保存单个自定义报表
     *
     * 保存单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return CreateReportResponse
     */
    public CreateReportResponse createReport(CreateReportRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createReport);
    }

    /**
     * 保存单个自定义报表
     *
     * 保存单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return SyncInvoker<CreateReportRequest, CreateReportResponse>
     */
    public SyncInvoker<CreateReportRequest, CreateReportResponse> createReportInvoker(CreateReportRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createReport, hcClient);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return CreateResourceUriResponse
     */
    public CreateResourceUriResponse createResourceUri(CreateResourceUriRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createResourceUri);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return SyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse>
     */
    public SyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse> createResourceUriInvoker(
        CreateResourceUriRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createResourceUri, hcClient);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createService, hcClient);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return CreateTestCaseResponse
     */
    public CreateTestCaseResponse createTestCase(CreateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseInvoker(
        CreateTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createTestCase, hcClient);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return CreateTestCaseInPlanResponse
     */
    public CreateTestCaseInPlanResponse createTestCaseInPlan(CreateTestCaseInPlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanInvoker(
        CreateTestCaseInPlanRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createTestCaseInPlan, hcClient);
    }

    /**
     * 新增用户自定义URL关键字
     *
     * 新增用户自定义URL关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDefinedUrlKeyWordRequest 请求对象
     * @return CreateUserDefinedUrlKeyWordResponse
     */
    public CreateUserDefinedUrlKeyWordResponse createUserDefinedUrlKeyWord(CreateUserDefinedUrlKeyWordRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createUserDefinedUrlKeyWord);
    }

    /**
     * 新增用户自定义URL关键字
     *
     * 新增用户自定义URL关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDefinedUrlKeyWordRequest 请求对象
     * @return SyncInvoker<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse>
     */
    public SyncInvoker<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse> createUserDefinedUrlKeyWordInvoker(
        CreateUserDefinedUrlKeyWordRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createUserDefinedUrlKeyWord, hcClient);
    }

    /**
     * 在分支或者测试计划下创建用例
     *
     * 在分支或者测试计划下创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVersionTestCaseRequest 请求对象
     * @return CreateVersionTestCaseResponse
     */
    public CreateVersionTestCaseResponse createVersionTestCase(CreateVersionTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createVersionTestCase);
    }

    /**
     * 在分支或者测试计划下创建用例
     *
     * 在分支或者测试计划下创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVersionTestCaseRequest 请求对象
     * @return SyncInvoker<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse>
     */
    public SyncInvoker<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse> createVersionTestCaseInvoker(
        CreateVersionTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createVersionTestCase, hcClient);
    }

    /**
     * 融合版本删除单个basicAw
     *
     * 融合版本删除单个basicAw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBasicAwByIdRequest 请求对象
     * @return DeleteBasicAwByIdResponse
     */
    public DeleteBasicAwByIdResponse deleteBasicAwById(DeleteBasicAwByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteBasicAwById);
    }

    /**
     * 融合版本删除单个basicAw
     *
     * 融合版本删除单个basicAw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBasicAwByIdRequest 请求对象
     * @return SyncInvoker<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse>
     */
    public SyncInvoker<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse> deleteBasicAwByIdInvoker(
        DeleteBasicAwByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteBasicAwById, hcClient);
    }

    /**
     * 删除因子
     *
     * 删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFacotrByIdRequest 请求对象
     * @return DeleteFacotrByIdResponse
     */
    public DeleteFacotrByIdResponse deleteFacotrById(DeleteFacotrByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteFacotrById);
    }

    /**
     * 删除因子
     *
     * 删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFacotrByIdRequest 请求对象
     * @return SyncInvoker<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse>
     */
    public SyncInvoker<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse> deleteFacotrByIdInvoker(
        DeleteFacotrByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteFacotrById, hcClient);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return DeleteRelationsByOneCaseResponse
     */
    public DeleteRelationsByOneCaseResponse deleteRelationsByOneCase(DeleteRelationsByOneCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteRelationsByOneCase);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return SyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse>
     */
    public SyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> deleteRelationsByOneCaseInvoker(
        DeleteRelationsByOneCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteRelationsByOneCase, hcClient);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteService, hcClient);
    }

    /**
     * 删除用例评论
     *
     * 删除用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTestCaseCommentRequest 请求对象
     * @return DeleteTestCaseCommentResponse
     */
    public DeleteTestCaseCommentResponse deleteTestCaseComment(DeleteTestCaseCommentRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteTestCaseComment);
    }

    /**
     * 删除用例评论
     *
     * 删除用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTestCaseCommentRequest 请求对象
     * @return SyncInvoker<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse>
     */
    public SyncInvoker<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse> deleteTestCaseCommentInvoker(
        DeleteTestCaseCommentRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteTestCaseComment, hcClient);
    }

    /**
     * 查询告警统计数据
     *
     * 查询告警统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsUsingRequest 请求对象
     * @return ListAlarmStatisticsUsingResponse
     */
    public ListAlarmStatisticsUsingResponse listAlarmStatisticsUsing(ListAlarmStatisticsUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAlarmStatisticsUsing);
    }

    /**
     * 查询告警统计数据
     *
     * 查询告警统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsUsingRequest 请求对象
     * @return SyncInvoker<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse>
     */
    public SyncInvoker<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse> listAlarmStatisticsUsingInvoker(
        ListAlarmStatisticsUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAlarmStatisticsUsing, hcClient);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return ListAlertGroupsByConditionResponse
     */
    public ListAlertGroupsByConditionResponse listAlertGroupsByCondition(ListAlertGroupsByConditionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAlertGroupsByCondition);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return SyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse>
     */
    public SyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> listAlertGroupsByConditionInvoker(
        ListAlertGroupsByConditionRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAlertGroupsByCondition, hcClient);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return ListAlertTemplatesResponse
     */
    public ListAlertTemplatesResponse listAlertTemplates(ListAlertTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAlertTemplates);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse>
     */
    public SyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse> listAlertTemplatesInvoker(
        ListAlertTemplatesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAlertTemplates, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return ListAllBranchesResponse
     */
    public ListAllBranchesResponse listAllBranches(ListAllBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return SyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse>
     */
    public SyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse> listAllBranchesInvoker(
        ListAllBranchesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllBranches, hcClient);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return ListAllConfigItemByTypeResponse
     */
    public ListAllConfigItemByTypeResponse listAllConfigItemByType(ListAllConfigItemByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllConfigItemByType);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return SyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse>
     */
    public SyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> listAllConfigItemByTypeInvoker(
        ListAllConfigItemByTypeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllConfigItemByType, hcClient);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return ListAllIteratorsResponse
     */
    public ListAllIteratorsResponse listAllIterators(ListAllIteratorsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllIterators);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return SyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse>
     */
    public SyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse> listAllIteratorsInvoker(
        ListAllIteratorsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllIterators, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTestCasesRequest 请求对象
     * @return ListAllTestCasesResponse
     */
    public ListAllTestCasesResponse listAllTestCases(ListAllTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTestCasesRequest 请求对象
     * @return SyncInvoker<ListAllTestCasesRequest, ListAllTestCasesResponse>
     */
    public SyncInvoker<ListAllTestCasesRequest, ListAllTestCasesResponse> listAllTestCasesInvoker(
        ListAllTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllTestCases, hcClient);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return ListAttachmentsResponse
     */
    public ListAttachmentsResponse listAttachments(ListAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAttachments);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>
     */
    public SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsInvoker(
        ListAttachmentsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAttachments, hcClient);
    }

    /**
     * 获取当前局点功能是否开启
     *
     * 获取当前局点功能是否开启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableConfigRequest 请求对象
     * @return ListAvailableConfigResponse
     */
    public ListAvailableConfigResponse listAvailableConfig(ListAvailableConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAvailableConfig);
    }

    /**
     * 获取当前局点功能是否开启
     *
     * 获取当前局点功能是否开启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableConfigRequest 请求对象
     * @return SyncInvoker<ListAvailableConfigRequest, ListAvailableConfigResponse>
     */
    public SyncInvoker<ListAvailableConfigRequest, ListAvailableConfigResponse> listAvailableConfigInvoker(
        ListAvailableConfigRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAvailableConfig, hcClient);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return ListBasicAwResponse
     */
    public ListBasicAwResponse listBasicAw(ListBasicAwRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listBasicAw);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return SyncInvoker<ListBasicAwRequest, ListBasicAwResponse>
     */
    public SyncInvoker<ListBasicAwRequest, ListBasicAwResponse> listBasicAwInvoker(ListBasicAwRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listBasicAw, hcClient);
    }

    /**
     * 分页获取工程BasicAW详细信息列表（含目录）
     *
     * 分页获取工程BasicAW列表（含目录）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwInfoListSupportsSearchRequest 请求对象
     * @return ListBasicAwInfoListSupportsSearchResponse
     */
    public ListBasicAwInfoListSupportsSearchResponse listBasicAwInfoListSupportsSearch(
        ListBasicAwInfoListSupportsSearchRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listBasicAwInfoListSupportsSearch);
    }

    /**
     * 分页获取工程BasicAW详细信息列表（含目录）
     *
     * 分页获取工程BasicAW列表（含目录）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwInfoListSupportsSearchRequest 请求对象
     * @return SyncInvoker<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse>
     */
    public SyncInvoker<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse> listBasicAwInfoListSupportsSearchInvoker(
        ListBasicAwInfoListSupportsSearchRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listBasicAwInfoListSupportsSearch, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return ListBranchesResponse
     */
    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return SyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public SyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesInvoker(ListBranchesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listBranches, hcClient);
    }

    /**
     * 批量获取用例状态
     *
     * 批量获取用例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesStatusRequest 请求对象
     * @return ListCasesStatusResponse
     */
    public ListCasesStatusResponse listCasesStatus(ListCasesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listCasesStatus);
    }

    /**
     * 批量获取用例状态
     *
     * 批量获取用例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesStatusRequest 请求对象
     * @return SyncInvoker<ListCasesStatusRequest, ListCasesStatusResponse>
     */
    public SyncInvoker<ListCasesStatusRequest, ListCasesStatusResponse> listCasesStatusInvoker(
        ListCasesStatusRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listCasesStatus, hcClient);
    }

    /**
     * 查询当前租户可见的第三方服务列表
     *
     * 查询当前租户可见的第三方服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainVisibleServicesRequest 请求对象
     * @return ListDomainVisibleServicesResponse
     */
    public ListDomainVisibleServicesResponse listDomainVisibleServices(ListDomainVisibleServicesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listDomainVisibleServices);
    }

    /**
     * 查询当前租户可见的第三方服务列表
     *
     * 查询当前租户可见的第三方服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainVisibleServicesRequest 请求对象
     * @return SyncInvoker<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse>
     */
    public SyncInvoker<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse> listDomainVisibleServicesInvoker(
        ListDomainVisibleServicesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listDomainVisibleServices, hcClient);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return ListIssueTreeResponse
     */
    public ListIssueTreeResponse listIssueTree(ListIssueTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listIssueTree);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return SyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse>
     */
    public SyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse> listIssueTreeInvoker(ListIssueTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listIssueTree, hcClient);
    }

    /**
     * 查询迭代关联的需求列表或树
     *
     * 查询迭代关联的需求列表或树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorIssueTreeRequest 请求对象
     * @return ListIteratorIssueTreeResponse
     */
    public ListIteratorIssueTreeResponse listIteratorIssueTree(ListIteratorIssueTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listIteratorIssueTree);
    }

    /**
     * 查询迭代关联的需求列表或树
     *
     * 查询迭代关联的需求列表或树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorIssueTreeRequest 请求对象
     * @return SyncInvoker<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse>
     */
    public SyncInvoker<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse> listIteratorIssueTreeInvoker(
        ListIteratorIssueTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listIteratorIssueTree, hcClient);
    }

    /**
     * 查询迭代计划列表，包含统计信息
     *
     * 查询迭代计划列表，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorsRequest 请求对象
     * @return ListIteratorsResponse
     */
    public ListIteratorsResponse listIterators(ListIteratorsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listIterators);
    }

    /**
     * 查询迭代计划列表，包含统计信息
     *
     * 查询迭代计划列表，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorsRequest 请求对象
     * @return SyncInvoker<ListIteratorsRequest, ListIteratorsResponse>
     */
    public SyncInvoker<ListIteratorsRequest, ListIteratorsResponse> listIteratorsInvoker(ListIteratorsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listIterators, hcClient);
    }

    /**
     * 查询仪表盘折线图数据
     *
     * 查询仪表盘折线图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinesUsingRequest 请求对象
     * @return ListLinesUsingResponse
     */
    public ListLinesUsingResponse listLinesUsing(ListLinesUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listLinesUsing);
    }

    /**
     * 查询仪表盘折线图数据
     *
     * 查询仪表盘折线图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinesUsingRequest 请求对象
     * @return SyncInvoker<ListLinesUsingRequest, ListLinesUsingResponse>
     */
    public SyncInvoker<ListLinesUsingRequest, ListLinesUsingResponse> listLinesUsingInvoker(
        ListLinesUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listLinesUsing, hcClient);
    }

    /**
     * 仪表盘根据测试服务ID获取MsgInfo详细信息
     *
     * 成功返回MsgInfo的详细信息列表，返回值为Model的List
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMsgInfosUsingRequest 请求对象
     * @return ListMsgInfosUsingResponse
     */
    public ListMsgInfosUsingResponse listMsgInfosUsing(ListMsgInfosUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listMsgInfosUsing);
    }

    /**
     * 仪表盘根据测试服务ID获取MsgInfo详细信息
     *
     * 成功返回MsgInfo的详细信息列表，返回值为Model的List
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMsgInfosUsingRequest 请求对象
     * @return SyncInvoker<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse>
     */
    public SyncInvoker<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse> listMsgInfosUsingInvoker(
        ListMsgInfosUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listMsgInfosUsing, hcClient);
    }

    /**
     * 获取责任人是自己的测试用例
     *
     * 获取责任人是自己的测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOwnTestCasesRequest 请求对象
     * @return ListOwnTestCasesResponse
     */
    public ListOwnTestCasesResponse listOwnTestCases(ListOwnTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listOwnTestCases);
    }

    /**
     * 获取责任人是自己的测试用例
     *
     * 获取责任人是自己的测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOwnTestCasesRequest 请求对象
     * @return SyncInvoker<ListOwnTestCasesRequest, ListOwnTestCasesResponse>
     */
    public SyncInvoker<ListOwnTestCasesRequest, ListOwnTestCasesResponse> listOwnTestCasesInvoker(
        ListOwnTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listOwnTestCases, hcClient);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return ListProjectFieldConfigsResponse
     */
    public ListProjectFieldConfigsResponse listProjectFieldConfigs(ListProjectFieldConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listProjectFieldConfigs);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return SyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse>
     */
    public SyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> listProjectFieldConfigsInvoker(
        ListProjectFieldConfigsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listProjectFieldConfigs, hcClient);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return ListProjectTestCaseFieldsResponse
     */
    public ListProjectTestCaseFieldsResponse listProjectTestCaseFields(ListProjectTestCaseFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listProjectTestCaseFields);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return SyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse>
     */
    public SyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> listProjectTestCaseFieldsInvoker(
        ListProjectTestCaseFieldsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listProjectTestCaseFields, hcClient);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return ListPublicLibAndAwsResponse
     */
    public ListPublicLibAndAwsResponse listPublicLibAndAws(ListPublicLibAndAwsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listPublicLibAndAws);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return SyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse>
     */
    public SyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> listPublicLibAndAwsInvoker(
        ListPublicLibAndAwsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listPublicLibAndAws, hcClient);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return ListReportsResponse
     */
    public ListReportsResponse listReports(ListReportsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listReports);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return SyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public SyncInvoker<ListReportsRequest, ListReportsResponse> listReportsInvoker(ListReportsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listReports, hcClient);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return ListResourcePoolsResponse
     */
    public ListResourcePoolsResponse listResourcePools(ListResourcePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listResourcePools);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return SyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse>
     */
    public SyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse> listResourcePoolsInvoker(
        ListResourcePoolsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listResourcePools, hcClient);
    }

    /**
     * 查询仪表盘散点图数据
     *
     * 查询仪表盘散点图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScattersUsingRequest 请求对象
     * @return ListScattersUsingResponse
     */
    public ListScattersUsingResponse listScattersUsing(ListScattersUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listScattersUsing);
    }

    /**
     * 查询仪表盘散点图数据
     *
     * 查询仪表盘散点图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScattersUsingRequest 请求对象
     * @return SyncInvoker<ListScattersUsingRequest, ListScattersUsingResponse>
     */
    public SyncInvoker<ListScattersUsingRequest, ListScattersUsingResponse> listScattersUsingInvoker(
        ListScattersUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listScattersUsing, hcClient);
    }

    /**
     * 查询subTestCase阻塞任务数据
     *
     * 成功返回子任务用例数据积压信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTaskCaseOverstockUsingRequest 请求对象
     * @return ListSubTaskCaseOverstockUsingResponse
     */
    public ListSubTaskCaseOverstockUsingResponse listSubTaskCaseOverstockUsing(
        ListSubTaskCaseOverstockUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listSubTaskCaseOverstockUsing);
    }

    /**
     * 查询subTestCase阻塞任务数据
     *
     * 成功返回子任务用例数据积压信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTaskCaseOverstockUsingRequest 请求对象
     * @return SyncInvoker<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse>
     */
    public SyncInvoker<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse> listSubTaskCaseOverstockUsingInvoker(
        ListSubTaskCaseOverstockUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listSubTaskCaseOverstockUsing, hcClient);
    }

    /**
     * 获取测试套关联用例详情
     *
     * 获取测试套关联用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskAssignCasesRequest 请求对象
     * @return ListTaskAssignCasesResponse
     */
    public ListTaskAssignCasesResponse listTaskAssignCases(ListTaskAssignCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTaskAssignCases);
    }

    /**
     * 获取测试套关联用例详情
     *
     * 获取测试套关联用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskAssignCasesRequest 请求对象
     * @return SyncInvoker<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse>
     */
    public SyncInvoker<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse> listTaskAssignCasesInvoker(
        ListTaskAssignCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTaskAssignCases, hcClient);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return ListTaskTestCasesResponse
     */
    public ListTaskTestCasesResponse listTaskTestCases(ListTaskTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTaskTestCases);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return SyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse>
     */
    public SyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse> listTaskTestCasesInvoker(
        ListTaskTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTaskTestCases, hcClient);
    }

    /**
     * 查询测试任务列表
     *
     * 查询测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTasks);
    }

    /**
     * 查询测试任务列表
     *
     * 查询测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTasks, hcClient);
    }

    /**
     * 查询用例评论
     *
     * 查询用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseCommentsRequest 请求对象
     * @return ListTestCaseCommentsResponse
     */
    public ListTestCaseCommentsResponse listTestCaseComments(ListTestCaseCommentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCaseComments);
    }

    /**
     * 查询用例评论
     *
     * 查询用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseCommentsRequest 请求对象
     * @return SyncInvoker<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse>
     */
    public SyncInvoker<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse> listTestCaseCommentsInvoker(
        ListTestCaseCommentsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCaseComments, hcClient);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return ListTestCaseHistoriesResponse
     */
    public ListTestCaseHistoriesResponse listTestCaseHistories(ListTestCaseHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCaseHistories);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return SyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse>
     */
    public SyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistoriesInvoker(
        ListTestCaseHistoriesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCaseHistories, hcClient);
    }

    /**
     * 获取用例脚本详细信息
     *
     * 获取用例脚本详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseScriptDetailRequest 请求对象
     * @return ListTestCaseScriptDetailResponse
     */
    public ListTestCaseScriptDetailResponse listTestCaseScriptDetail(ListTestCaseScriptDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCaseScriptDetail);
    }

    /**
     * 获取用例脚本详细信息
     *
     * 获取用例脚本详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseScriptDetailRequest 请求对象
     * @return SyncInvoker<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse>
     */
    public SyncInvoker<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse> listTestCaseScriptDetailInvoker(
        ListTestCaseScriptDetailRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCaseScriptDetail, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return ListTestCasesResponse
     */
    public ListTestCasesResponse listTestCases(ListTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return SyncInvoker<ListTestCasesRequest, ListTestCasesResponse>
     */
    public SyncInvoker<ListTestCasesRequest, ListTestCasesResponse> listTestCasesInvoker(ListTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCases, hcClient);
    }

    /**
     * 查询需求下的用例列表
     *
     * 查询需求下的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesByIssueRequest 请求对象
     * @return ListTestCasesByIssueResponse
     */
    public ListTestCasesByIssueResponse listTestCasesByIssue(ListTestCasesByIssueRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCasesByIssue);
    }

    /**
     * 查询需求下的用例列表
     *
     * 查询需求下的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesByIssueRequest 请求对象
     * @return SyncInvoker<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse>
     */
    public SyncInvoker<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse> listTestCasesByIssueInvoker(
        ListTestCasesByIssueRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCasesByIssue, hcClient);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return ListTestReportsByConditionResponse
     */
    public ListTestReportsByConditionResponse listTestReportsByCondition(ListTestReportsByConditionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestReportsByCondition);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return SyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse>
     */
    public SyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> listTestReportsByConditionInvoker(
        ListTestReportsByConditionRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestReportsByCondition, hcClient);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return ListTestTypesResponse
     */
    public ListTestTypesResponse listTestTypes(ListTestTypesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestTypes);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return SyncInvoker<ListTestTypesRequest, ListTestTypesResponse>
     */
    public SyncInvoker<ListTestTypesRequest, ListTestTypesResponse> listTestTypesInvoker(ListTestTypesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestTypes, hcClient);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return ListTestcasesByProjectIssuesRelationResponse
     */
    public ListTestcasesByProjectIssuesRelationResponse listTestcasesByProjectIssuesRelation(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestcasesByProjectIssuesRelation);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return SyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse>
     */
    public SyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelationInvoker(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestcasesByProjectIssuesRelation, hcClient);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return ListUsageInfosResponse
     */
    public ListUsageInfosResponse listUsageInfos(ListUsageInfosRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUsageInfos);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return SyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse>
     */
    public SyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse> listUsageInfosInvoker(
        ListUsageInfosRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUsageInfos, hcClient);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return ListUserDnsMappingResponse
     */
    public ListUserDnsMappingResponse listUserDnsMapping(ListUserDnsMappingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUserDnsMapping);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return SyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse>
     */
    public SyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse> listUserDnsMappingInvoker(
        ListUserDnsMappingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUserDnsMapping, hcClient);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return ListUserPackageUsageResponse
     */
    public ListUserPackageUsageResponse listUserPackageUsage(ListUserPackageUsageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUserPackageUsage);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return SyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse>
     */
    public SyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse> listUserPackageUsageInvoker(
        ListUserPackageUsageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUserPackageUsage, hcClient);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return ListUserPopupInfoResponse
     */
    public ListUserPopupInfoResponse listUserPopupInfo(ListUserPopupInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUserPopupInfo);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return SyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse>
     */
    public SyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse> listUserPopupInfoInvoker(
        ListUserPopupInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUserPopupInfo, hcClient);
    }

    /**
     * 查询仪表盘用户的看板
     *
     * 查询仪表盘用户的看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingGetRequest 请求对象
     * @return ListUsingGetResponse
     */
    public ListUsingGetResponse listUsingGet(ListUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUsingGet);
    }

    /**
     * 查询仪表盘用户的看板
     *
     * 查询仪表盘用户的看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingGetRequest 请求对象
     * @return SyncInvoker<ListUsingGetRequest, ListUsingGetResponse>
     */
    public SyncInvoker<ListUsingGetRequest, ListUsingGetResponse> listUsingGetInvoker(ListUsingGetRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUsingGet, hcClient);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return ListVariablesResponse
     */
    public ListVariablesResponse listVariables(ListVariablesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listVariables);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return SyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public SyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesInvoker(ListVariablesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listVariables, hcClient);
    }

    /**
     * 从迭代中移除需求
     *
     * 从迭代中移除需求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIssuesFromIteratorRequest 请求对象
     * @return RemoveIssuesFromIteratorResponse
     */
    public RemoveIssuesFromIteratorResponse removeIssuesFromIterator(RemoveIssuesFromIteratorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.removeIssuesFromIterator);
    }

    /**
     * 从迭代中移除需求
     *
     * 从迭代中移除需求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIssuesFromIteratorRequest 请求对象
     * @return SyncInvoker<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse>
     */
    public SyncInvoker<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse> removeIssuesFromIteratorInvoker(
        RemoveIssuesFromIteratorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.removeIssuesFromIterator, hcClient);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return RunTestCaseResponse
     */
    public RunTestCaseResponse runTestCase(RunTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return SyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public SyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseInvoker(RunTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.runTestCase, hcClient);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return SaveTaskSettingResponse
     */
    public SaveTaskSettingResponse saveTaskSetting(SaveTaskSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.saveTaskSetting);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return SyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse>
     */
    public SyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse> saveTaskSettingInvoker(
        SaveTaskSettingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.saveTaskSetting, hcClient);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return ShowAllConfigValueByTypeAndKeyResponse
     */
    public ShowAllConfigValueByTypeAndKeyResponse showAllConfigValueByTypeAndKey(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showAllConfigValueByTypeAndKey);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return SyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse>
     */
    public SyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKeyInvoker(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showAllConfigValueByTypeAndKey, hcClient);
    }

    /**
     * 获取特性树V5
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return ShowAllFeatureChildrenResponse
     */
    public ShowAllFeatureChildrenResponse showAllFeatureChildren(ShowAllFeatureChildrenRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showAllFeatureChildren);
    }

    /**
     * 获取特性树V5
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return SyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse>
     */
    public SyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> showAllFeatureChildrenInvoker(
        ShowAllFeatureChildrenRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showAllFeatureChildren, hcClient);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return ShowApiTestcaseHistoriesResponse
     */
    public ShowApiTestcaseHistoriesResponse showApiTestcaseHistories(ShowApiTestcaseHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showApiTestcaseHistories);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return SyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse>
     */
    public SyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesInvoker(
        ShowApiTestcaseHistoriesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showApiTestcaseHistories, hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return ShowAssetResponse
     */
    public ShowAssetResponse showAsset(ShowAssetRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showAsset);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return SyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public SyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetInvoker(ShowAssetRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showAsset, hcClient);
    }

    /**
     * 获取资产树列表
     *
     * 获取资产树列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetTreeRequest 请求对象
     * @return ShowAssetTreeResponse
     */
    public ShowAssetTreeResponse showAssetTree(ShowAssetTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showAssetTree);
    }

    /**
     * 获取资产树列表
     *
     * 获取资产树列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetTreeRequest 请求对象
     * @return SyncInvoker<ShowAssetTreeRequest, ShowAssetTreeResponse>
     */
    public SyncInvoker<ShowAssetTreeRequest, ShowAssetTreeResponse> showAssetTreeInvoker(ShowAssetTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showAssetTree, hcClient);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return ShowBackgroundInfoResponse
     */
    public ShowBackgroundInfoResponse showBackgroundInfo(ShowBackgroundInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showBackgroundInfo);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return SyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse>
     */
    public SyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> showBackgroundInfoInvoker(
        ShowBackgroundInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showBackgroundInfo, hcClient);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return ShowBranchResponse
     */
    public ShowBranchResponse showBranch(ShowBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showBranch);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return SyncInvoker<ShowBranchRequest, ShowBranchResponse>
     */
    public SyncInvoker<ShowBranchRequest, ShowBranchResponse> showBranchInvoker(ShowBranchRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showBranch, hcClient);
    }

    /**
     * 查询用例结果
     *
     * 查询用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseResultRequest 请求对象
     * @return ShowCaseResultResponse
     */
    public ShowCaseResultResponse showCaseResult(ShowCaseResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showCaseResult);
    }

    /**
     * 查询用例结果
     *
     * 查询用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseResultRequest 请求对象
     * @return SyncInvoker<ShowCaseResultRequest, ShowCaseResultResponse>
     */
    public SyncInvoker<ShowCaseResultRequest, ShowCaseResultResponse> showCaseResultInvoker(
        ShowCaseResultRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showCaseResult, hcClient);
    }

    /**
     * 查询租户测试并发套餐状态
     *
     * 查询租户测试并发套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConcurrencyPackageUsingRequest 请求对象
     * @return ShowConcurrencyPackageUsingResponse
     */
    public ShowConcurrencyPackageUsingResponse showConcurrencyPackageUsing(ShowConcurrencyPackageUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showConcurrencyPackageUsing);
    }

    /**
     * 查询租户测试并发套餐状态
     *
     * 查询租户测试并发套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConcurrencyPackageUsingRequest 请求对象
     * @return SyncInvoker<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse>
     */
    public SyncInvoker<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse> showConcurrencyPackageUsingInvoker(
        ShowConcurrencyPackageUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showConcurrencyPackageUsing, hcClient);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return ShowDisclaimerRecordResponse
     */
    public ShowDisclaimerRecordResponse showDisclaimerRecord(ShowDisclaimerRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showDisclaimerRecord);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return SyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse>
     */
    public SyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> showDisclaimerRecordInvoker(
        ShowDisclaimerRecordRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showDisclaimerRecord, hcClient);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return ShowDomainInfoResponse
     */
    public ShowDomainInfoResponse showDomainInfo(ShowDomainInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showDomainInfo);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return SyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse>
     */
    public SyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse> showDomainInfoInvoker(
        ShowDomainInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showDomainInfo, hcClient);
    }

    /**
     * 查询租户在线拨测套餐状态
     *
     * 查询租户在线拨测套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEchoTestPackageUsingRequest 请求对象
     * @return ShowEchoTestPackageUsingResponse
     */
    public ShowEchoTestPackageUsingResponse showEchoTestPackageUsing(ShowEchoTestPackageUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showEchoTestPackageUsing);
    }

    /**
     * 查询租户在线拨测套餐状态
     *
     * 查询租户在线拨测套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEchoTestPackageUsingRequest 请求对象
     * @return SyncInvoker<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse>
     */
    public SyncInvoker<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse> showEchoTestPackageUsingInvoker(
        ShowEchoTestPackageUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showEchoTestPackageUsing, hcClient);
    }

    /**
     * 根据目录查询因子
     *
     * 根据目录查询因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByAssetIdRequest 请求对象
     * @return ShowFactorByAssetIdResponse
     */
    public ShowFactorByAssetIdResponse showFactorByAssetId(ShowFactorByAssetIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showFactorByAssetId);
    }

    /**
     * 根据目录查询因子
     *
     * 根据目录查询因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByAssetIdRequest 请求对象
     * @return SyncInvoker<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse>
     */
    public SyncInvoker<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse> showFactorByAssetIdInvoker(
        ShowFactorByAssetIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showFactorByAssetId, hcClient);
    }

    /**
     * 根据id获取因子
     *
     * 根据id获取因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByIdRequest 请求对象
     * @return ShowFactorByIdResponse
     */
    public ShowFactorByIdResponse showFactorById(ShowFactorByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showFactorById);
    }

    /**
     * 根据id获取因子
     *
     * 根据id获取因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByIdRequest 请求对象
     * @return SyncInvoker<ShowFactorByIdRequest, ShowFactorByIdResponse>
     */
    public SyncInvoker<ShowFactorByIdRequest, ShowFactorByIdResponse> showFactorByIdInvoker(
        ShowFactorByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showFactorById, hcClient);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return ShowFeatureChildrenResponse
     */
    public ShowFeatureChildrenResponse showFeatureChildren(ShowFeatureChildrenRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showFeatureChildren);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return SyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse>
     */
    public SyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> showFeatureChildrenInvoker(
        ShowFeatureChildrenRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showFeatureChildren, hcClient);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return ShowFreeDeclarationResponse
     */
    public ShowFreeDeclarationResponse showFreeDeclaration(ShowFreeDeclarationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showFreeDeclaration);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return SyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse>
     */
    public SyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> showFreeDeclarationInvoker(
        ShowFreeDeclarationRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showFreeDeclaration, hcClient);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return ShowIfTaskNameRepeatResponse
     */
    public ShowIfTaskNameRepeatResponse showIfTaskNameRepeat(ShowIfTaskNameRepeatRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIfTaskNameRepeat);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return SyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse>
     */
    public SyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> showIfTaskNameRepeatInvoker(
        ShowIfTaskNameRepeatRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIfTaskNameRepeat, hcClient);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return ShowIfUserNameRepeatResponse
     */
    public ShowIfUserNameRepeatResponse showIfUserNameRepeat(ShowIfUserNameRepeatRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIfUserNameRepeat);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return SyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse>
     */
    public SyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> showIfUserNameRepeatInvoker(
        ShowIfUserNameRepeatRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIfUserNameRepeat, hcClient);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return ShowIssuesByPlanIdResponse
     */
    public ShowIssuesByPlanIdResponse showIssuesByPlanId(ShowIssuesByPlanIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIssuesByPlanId);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>
     */
    public SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanIdInvoker(
        ShowIssuesByPlanIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIssuesByPlanId, hcClient);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return ShowIteratorByDefectResponse
     */
    public ShowIteratorByDefectResponse showIteratorByDefect(ShowIteratorByDefectRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIteratorByDefect);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return SyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse>
     */
    public SyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> showIteratorByDefectInvoker(
        ShowIteratorByDefectRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIteratorByDefect, hcClient);
    }

    /**
     * 查询迭代计划详情，包含统计信息
     *
     * 查询迭代计划详情，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorDetailRequest 请求对象
     * @return ShowIteratorDetailResponse
     */
    public ShowIteratorDetailResponse showIteratorDetail(ShowIteratorDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIteratorDetail);
    }

    /**
     * 查询迭代计划详情，包含统计信息
     *
     * 查询迭代计划详情，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorDetailRequest 请求对象
     * @return SyncInvoker<ShowIteratorDetailRequest, ShowIteratorDetailResponse>
     */
    public SyncInvoker<ShowIteratorDetailRequest, ShowIteratorDetailResponse> showIteratorDetailInvoker(
        ShowIteratorDetailRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIteratorDetail, hcClient);
    }

    /**
     * 根据id获取脑图对象
     *
     * 根据id获取脑图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindMapByIdRequest 请求对象
     * @return ShowMindMapByIdResponse
     */
    public ShowMindMapByIdResponse showMindMapById(ShowMindMapByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindMapById);
    }

    /**
     * 根据id获取脑图对象
     *
     * 根据id获取脑图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindMapByIdRequest 请求对象
     * @return SyncInvoker<ShowMindMapByIdRequest, ShowMindMapByIdResponse>
     */
    public SyncInvoker<ShowMindMapByIdRequest, ShowMindMapByIdResponse> showMindMapByIdInvoker(
        ShowMindMapByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindMapById, hcClient);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return ShowMindmapByPageResponse
     */
    public ShowMindmapByPageResponse showMindmapByPage(ShowMindmapByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapByPage);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return SyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse>
     */
    public SyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse> showMindmapByPageInvoker(
        ShowMindmapByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapByPage, hcClient);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return ShowMindmapCreatorNameResponse
     */
    public ShowMindmapCreatorNameResponse showMindmapCreatorName(ShowMindmapCreatorNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapCreatorName);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return SyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse>
     */
    public SyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> showMindmapCreatorNameInvoker(
        ShowMindmapCreatorNameRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapCreatorName, hcClient);
    }

    /**
     * 查询运行面板信息
     *
     * 成功返回运行面板信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationalDataCurrentMonthUsingRequest 请求对象
     * @return ShowOperationalDataCurrentMonthUsingResponse
     */
    public ShowOperationalDataCurrentMonthUsingResponse showOperationalDataCurrentMonthUsing(
        ShowOperationalDataCurrentMonthUsingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showOperationalDataCurrentMonthUsing);
    }

    /**
     * 查询运行面板信息
     *
     * 成功返回运行面板信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationalDataCurrentMonthUsingRequest 请求对象
     * @return SyncInvoker<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse>
     */
    public SyncInvoker<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse> showOperationalDataCurrentMonthUsingInvoker(
        ShowOperationalDataCurrentMonthUsingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showOperationalDataCurrentMonthUsing, hcClient);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return ShowPlanJournalsResponse
     */
    public ShowPlanJournalsResponse showPlanJournals(ShowPlanJournalsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlanJournals);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>
     */
    public SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournalsInvoker(
        ShowPlanJournalsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showPlanJournals, hcClient);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return ShowPlanListResponse
     */
    public ShowPlanListResponse showPlanList(ShowPlanListRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlanList);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return SyncInvoker<ShowPlanListRequest, ShowPlanListResponse>
     */
    public SyncInvoker<ShowPlanListRequest, ShowPlanListResponse> showPlanListInvoker(ShowPlanListRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showPlanList, hcClient);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return ShowPlansResponse
     */
    public ShowPlansResponse showPlans(ShowPlansRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlans);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return SyncInvoker<ShowPlansRequest, ShowPlansResponse>
     */
    public SyncInvoker<ShowPlansRequest, ShowPlansResponse> showPlansInvoker(ShowPlansRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showPlans, hcClient);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return ShowProgressResponse
     */
    public ShowProgressResponse showProgress(ShowProgressRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showProgress);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return SyncInvoker<ShowProgressRequest, ShowProgressResponse>
     */
    public SyncInvoker<ShowProgressRequest, ShowProgressResponse> showProgressInvoker(ShowProgressRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showProgress, hcClient);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return ShowProjectDataDashboardResponse
     */
    public ShowProjectDataDashboardResponse showProjectDataDashboard(ShowProjectDataDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showProjectDataDashboard);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return SyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse>
     */
    public SyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> showProjectDataDashboardInvoker(
        ShowProjectDataDashboardRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showProjectDataDashboard, hcClient);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return ShowRegisterServiceResponse
     */
    public ShowRegisterServiceResponse showRegisterService(ShowRegisterServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceInvoker(
        ShowRegisterServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showRegisterService, hcClient);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return ShowReportResponse
     */
    public ShowReportResponse showReport(ShowReportRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showReport);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return SyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public SyncInvoker<ShowReportRequest, ShowReportResponse> showReportInvoker(ShowReportRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showReport, hcClient);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return ShowRequirementsOverviewResponse
     */
    public ShowRequirementsOverviewResponse showRequirementsOverview(ShowRequirementsOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showRequirementsOverview);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return SyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse>
     */
    public SyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> showRequirementsOverviewInvoker(
        ShowRequirementsOverviewRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showRequirementsOverview, hcClient);
    }

    /**
     * 根据条件分页获取评审对象V2
     *
     * 根据条件分页获取评审对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewByPageRequest 请求对象
     * @return ShowReviewByPageResponse
     */
    public ShowReviewByPageResponse showReviewByPage(ShowReviewByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showReviewByPage);
    }

    /**
     * 根据条件分页获取评审对象V2
     *
     * 根据条件分页获取评审对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewByPageRequest 请求对象
     * @return SyncInvoker<ShowReviewByPageRequest, ShowReviewByPageResponse>
     */
    public SyncInvoker<ShowReviewByPageRequest, ShowReviewByPageResponse> showReviewByPageInvoker(
        ShowReviewByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showReviewByPage, hcClient);
    }

    /**
     * 根据条件分页获取场景对象V2
     *
     * 根据条件分页获取场景对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSceneByPageRequest 请求对象
     * @return ShowSceneByPageResponse
     */
    public ShowSceneByPageResponse showSceneByPage(ShowSceneByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showSceneByPage);
    }

    /**
     * 根据条件分页获取场景对象V2
     *
     * 根据条件分页获取场景对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSceneByPageRequest 请求对象
     * @return SyncInvoker<ShowSceneByPageRequest, ShowSceneByPageResponse>
     */
    public SyncInvoker<ShowSceneByPageRequest, ShowSceneByPageResponse> showSceneByPageInvoker(
        ShowSceneByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showSceneByPage, hcClient);
    }

    /**
     * 根据脑图id查询统计数目
     *
     * 根据脑图id查询统计数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticByIdRequest 请求对象
     * @return ShowStatisticByIdResponse
     */
    public ShowStatisticByIdResponse showStatisticById(ShowStatisticByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showStatisticById);
    }

    /**
     * 根据脑图id查询统计数目
     *
     * 根据脑图id查询统计数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticByIdRequest 请求对象
     * @return SyncInvoker<ShowStatisticByIdRequest, ShowStatisticByIdResponse>
     */
    public SyncInvoker<ShowStatisticByIdRequest, ShowStatisticByIdResponse> showStatisticByIdInvoker(
        ShowStatisticByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showStatisticById, hcClient);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return ShowSystemConfigsResponse
     */
    public ShowSystemConfigsResponse showSystemConfigs(ShowSystemConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showSystemConfigs);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return SyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse>
     */
    public SyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse> showSystemConfigsInvoker(
        ShowSystemConfigsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showSystemConfigs, hcClient);
    }

    /**
     * 获取模板V2
     *
     * 获取模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByIdRequest 请求对象
     * @return ShowTemplateByIdResponse
     */
    public ShowTemplateByIdResponse showTemplateById(ShowTemplateByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTemplateById);
    }

    /**
     * 获取模板V2
     *
     * 获取模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByIdRequest 请求对象
     * @return SyncInvoker<ShowTemplateByIdRequest, ShowTemplateByIdResponse>
     */
    public SyncInvoker<ShowTemplateByIdRequest, ShowTemplateByIdResponse> showTemplateByIdInvoker(
        ShowTemplateByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTemplateById, hcClient);
    }

    /**
     * 根据条件分页获取模板V3
     *
     * 根据条件分页获取模板V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByPageRequest 请求对象
     * @return ShowTemplateByPageResponse
     */
    public ShowTemplateByPageResponse showTemplateByPage(ShowTemplateByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTemplateByPage);
    }

    /**
     * 根据条件分页获取模板V3
     *
     * 根据条件分页获取模板V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByPageRequest 请求对象
     * @return SyncInvoker<ShowTemplateByPageRequest, ShowTemplateByPageResponse>
     */
    public SyncInvoker<ShowTemplateByPageRequest, ShowTemplateByPageResponse> showTemplateByPageInvoker(
        ShowTemplateByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTemplateByPage, hcClient);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return ShowTestCaseResponse
     */
    public ShowTestCaseResponse showTestCase(ShowTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCase);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return SyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse>
     */
    public SyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse> showTestCaseInvoker(ShowTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCase, hcClient);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return ShowTestCaseAndDefectInfoResponse
     */
    public ShowTestCaseAndDefectInfoResponse showTestCaseAndDefectInfo(ShowTestCaseAndDefectInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseAndDefectInfo);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return SyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse>
     */
    public SyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoInvoker(
        ShowTestCaseAndDefectInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseAndDefectInfo, hcClient);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return ShowTestCaseDetailResponse
     */
    public ShowTestCaseDetailResponse showTestCaseDetail(ShowTestCaseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailInvoker(
        ShowTestCaseDetailRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseDetail, hcClient);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return ShowTestCaseDetailV2Response
     */
    public ShowTestCaseDetailV2Response showTestCaseDetailV2(ShowTestCaseDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2Invoker(
        ShowTestCaseDetailV2Request request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseDetailV2, hcClient);
    }

    /**
     * 根据用例查询评审记录
     *
     * 根据用例查询评审记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseReviewsRequest 请求对象
     * @return ShowTestCaseReviewsResponse
     */
    public ShowTestCaseReviewsResponse showTestCaseReviews(ShowTestCaseReviewsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseReviews);
    }

    /**
     * 根据用例查询评审记录
     *
     * 根据用例查询评审记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseReviewsRequest 请求对象
     * @return SyncInvoker<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse>
     */
    public SyncInvoker<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse> showTestCaseReviewsInvoker(
        ShowTestCaseReviewsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseReviews, hcClient);
    }

    /**
     * 版本测试用例变更统计（只统计分支，不统计基线）
     *
     * 版本测试用例变更统计（只统计分支，不统计基线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCasesChangeStatisticsRequest 请求对象
     * @return ShowTestCasesChangeStatisticsResponse
     */
    public ShowTestCasesChangeStatisticsResponse showTestCasesChangeStatistics(
        ShowTestCasesChangeStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCasesChangeStatistics);
    }

    /**
     * 版本测试用例变更统计（只统计分支，不统计基线）
     *
     * 版本测试用例变更统计（只统计分支，不统计基线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCasesChangeStatisticsRequest 请求对象
     * @return SyncInvoker<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse>
     */
    public SyncInvoker<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse> showTestCasesChangeStatisticsInvoker(
        ShowTestCasesChangeStatisticsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCasesChangeStatistics, hcClient);
    }

    /**
     * 根据条件分页获取测试用例对象V2
     *
     * 根据条件分页获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByPageRequest 请求对象
     * @return ShowTestcaseByPageResponse
     */
    public ShowTestcaseByPageResponse showTestcaseByPage(ShowTestcaseByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestcaseByPage);
    }

    /**
     * 根据条件分页获取测试用例对象V2
     *
     * 根据条件分页获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByPageRequest 请求对象
     * @return SyncInvoker<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse>
     */
    public SyncInvoker<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse> showTestcaseByPageInvoker(
        ShowTestcaseByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestcaseByPage, hcClient);
    }

    /**
     * 根据条件分页获取测试点对象V2
     *
     * 根据条件分页获取测试点对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestpointByPageRequest 请求对象
     * @return ShowTestpointByPageResponse
     */
    public ShowTestpointByPageResponse showTestpointByPage(ShowTestpointByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestpointByPage);
    }

    /**
     * 根据条件分页获取测试点对象V2
     *
     * 根据条件分页获取测试点对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestpointByPageRequest 请求对象
     * @return SyncInvoker<ShowTestpointByPageRequest, ShowTestpointByPageResponse>
     */
    public SyncInvoker<ShowTestpointByPageRequest, ShowTestpointByPageResponse> showTestpointByPageInvoker(
        ShowTestpointByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestpointByPage, hcClient);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return ShowUserAccessInfoResponse
     */
    public ShowUserAccessInfoResponse showUserAccessInfo(ShowUserAccessInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showUserAccessInfo);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return SyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse>
     */
    public SyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> showUserAccessInfoInvoker(
        ShowUserAccessInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showUserAccessInfo, hcClient);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return ShowUserExecuteTestCaseInfoResponse
     */
    public ShowUserExecuteTestCaseInfoResponse showUserExecuteTestCaseInfo(ShowUserExecuteTestCaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showUserExecuteTestCaseInfo);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return SyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse>
     */
    public SyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoInvoker(
        ShowUserExecuteTestCaseInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showUserExecuteTestCaseInfo, hcClient);
    }

    /**
     * 修改关键字信息接口
     *
     * 修改关键字信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBasicAwByIdRequest 请求对象
     * @return UpdateBasicAwByIdResponse
     */
    public UpdateBasicAwByIdResponse updateBasicAwById(UpdateBasicAwByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateBasicAwById);
    }

    /**
     * 修改关键字信息接口
     *
     * 修改关键字信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBasicAwByIdRequest 请求对象
     * @return SyncInvoker<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse>
     */
    public SyncInvoker<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse> updateBasicAwByIdInvoker(
        UpdateBasicAwByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateBasicAwById, hcClient);
    }

    /**
     * 修改测试计划
     *
     * 修改测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIteratorRequest 请求对象
     * @return UpdateIteratorResponse
     */
    public UpdateIteratorResponse updateIterator(UpdateIteratorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateIterator);
    }

    /**
     * 修改测试计划
     *
     * 修改测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIteratorRequest 请求对象
     * @return SyncInvoker<UpdateIteratorRequest, UpdateIteratorResponse>
     */
    public SyncInvoker<UpdateIteratorRequest, UpdateIteratorResponse> updateIteratorInvoker(
        UpdateIteratorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateIterator, hcClient);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateService, hcClient);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return UpdateTestCaseResponse
     */
    public UpdateTestCaseResponse updateTestCase(UpdateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseInvoker(
        UpdateTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateTestCase, hcClient);
    }

    /**
     * 更新tmss用例和用例脚本
     *
     * 更新tmss用例和用例脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseAndScriptRequest 请求对象
     * @return UpdateTestCaseAndScriptResponse
     */
    public UpdateTestCaseAndScriptResponse updateTestCaseAndScript(UpdateTestCaseAndScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCaseAndScript);
    }

    /**
     * 更新tmss用例和用例脚本
     *
     * 更新tmss用例和用例脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseAndScriptRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse>
     */
    public SyncInvoker<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse> updateTestCaseAndScriptInvoker(
        UpdateTestCaseAndScriptRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateTestCaseAndScript, hcClient);
    }

    /**
     * 修改用例评论
     *
     * 修改用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseCommentRequest 请求对象
     * @return UpdateTestCaseCommentResponse
     */
    public UpdateTestCaseCommentResponse updateTestCaseComment(UpdateTestCaseCommentRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCaseComment);
    }

    /**
     * 修改用例评论
     *
     * 修改用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseCommentRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse>
     */
    public SyncInvoker<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse> updateTestCaseCommentInvoker(
        UpdateTestCaseCommentRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateTestCaseComment, hcClient);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return UpdateTestCaseResultResponse
     */
    public UpdateTestCaseResultResponse updateTestCaseResult(UpdateTestCaseResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultInvoker(
        UpdateTestCaseResultRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateTestCaseResult, hcClient);
    }

    /**
     * 更新用户DNS映射
     *
     * 更新用户DNS映射，执行器自定义映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserDnsMappingRequest 请求对象
     * @return UpdateUserDnsMappingResponse
     */
    public UpdateUserDnsMappingResponse updateUserDnsMapping(UpdateUserDnsMappingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateUserDnsMapping);
    }

    /**
     * 更新用户DNS映射
     *
     * 更新用户DNS映射，执行器自定义映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserDnsMappingRequest 请求对象
     * @return SyncInvoker<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse>
     */
    public SyncInvoker<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse> updateUserDnsMappingInvoker(
        UpdateUserDnsMappingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateUserDnsMapping, hcClient);
    }

    /**
     * 在分支或者测试计划下修改用例
     *
     * 在分支或者测试计划下修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionTestCaseRequest 请求对象
     * @return UpdateVersionTestCaseResponse
     */
    public UpdateVersionTestCaseResponse updateVersionTestCase(UpdateVersionTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateVersionTestCase);
    }

    /**
     * 在分支或者测试计划下修改用例
     *
     * 在分支或者测试计划下修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionTestCaseRequest 请求对象
     * @return SyncInvoker<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse>
     */
    public SyncInvoker<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse> updateVersionTestCaseInvoker(
        UpdateVersionTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateVersionTestCase, hcClient);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CreateApiTestSuiteByRepoFileResponse
     */
    public CreateApiTestSuiteByRepoFileResponse createApiTestSuiteByRepoFile(
        CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileInvoker(
        CreateApiTestSuiteByRepoFileRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listEnvironments, hcClient);
    }

    /**
     * 批量删除因子
     *
     * 批量删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacotrByIdsRequest 请求对象
     * @return BatchDeleteFacotrByIdsResponse
     */
    public BatchDeleteFacotrByIdsResponse batchDeleteFacotrByIds(BatchDeleteFacotrByIdsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteFacotrByIds);
    }

    /**
     * 批量删除因子
     *
     * 批量删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacotrByIdsRequest 请求对象
     * @return SyncInvoker<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse>
     */
    public SyncInvoker<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse> batchDeleteFacotrByIdsInvoker(
        BatchDeleteFacotrByIdsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchDeleteFacotrByIds, hcClient);
    }

    /**
     * 批量查询用例V3
     *
     * 批量查询用例V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowTestCaseRequest 请求对象
     * @return BatchShowTestCaseResponse
     */
    public BatchShowTestCaseResponse batchShowTestCase(BatchShowTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchShowTestCase);
    }

    /**
     * 批量查询用例V3
     *
     * 批量查询用例V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowTestCaseRequest 请求对象
     * @return SyncInvoker<BatchShowTestCaseRequest, BatchShowTestCaseResponse>
     */
    public SyncInvoker<BatchShowTestCaseRequest, BatchShowTestCaseResponse> batchShowTestCaseInvoker(
        BatchShowTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchShowTestCase, hcClient);
    }

    /**
     * 新增资产树节点
     *
     * 新增资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetTreeRequest 请求对象
     * @return CreateAssetTreeResponse
     */
    public CreateAssetTreeResponse createAssetTree(CreateAssetTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createAssetTree);
    }

    /**
     * 新增资产树节点
     *
     * 新增资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetTreeRequest 请求对象
     * @return SyncInvoker<CreateAssetTreeRequest, CreateAssetTreeResponse>
     */
    public SyncInvoker<CreateAssetTreeRequest, CreateAssetTreeResponse> createAssetTreeInvoker(
        CreateAssetTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createAssetTree, hcClient);
    }

    /**
     * 备份脑图V2
     *
     * 备份脑图V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackupMindmapRequest 请求对象
     * @return CreateBackupMindmapResponse
     */
    public CreateBackupMindmapResponse createBackupMindmap(CreateBackupMindmapRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createBackupMindmap);
    }

    /**
     * 备份脑图V2
     *
     * 备份脑图V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackupMindmapRequest 请求对象
     * @return SyncInvoker<CreateBackupMindmapRequest, CreateBackupMindmapResponse>
     */
    public SyncInvoker<CreateBackupMindmapRequest, CreateBackupMindmapResponse> createBackupMindmapInvoker(
        CreateBackupMindmapRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createBackupMindmap, hcClient);
    }

    /**
     * 保存模板V2
     *
     * 保存模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTemplate);
    }

    /**
     * 保存模板V2
     *
     * 保存模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createTemplate, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return DeleteAssetResponse
     */
    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public SyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetInvoker(DeleteAssetRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteAsset, hcClient);
    }

    /**
     * 删除资产树节点
     *
     * 删除资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetTreeRequest 请求对象
     * @return DeleteAssetTreeResponse
     */
    public DeleteAssetTreeResponse deleteAssetTree(DeleteAssetTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteAssetTree);
    }

    /**
     * 删除资产树节点
     *
     * 删除资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetTreeRequest 请求对象
     * @return SyncInvoker<DeleteAssetTreeRequest, DeleteAssetTreeResponse>
     */
    public SyncInvoker<DeleteAssetTreeRequest, DeleteAssetTreeResponse> deleteAssetTreeInvoker(
        DeleteAssetTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteAssetTree, hcClient);
    }

    /**
     * 根据id删除脑图备份V2
     *
     * 根据id删除脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapBackupByIdRequest 请求对象
     * @return DeleteMindmapBackupByIdResponse
     */
    public DeleteMindmapBackupByIdResponse deleteMindmapBackupById(DeleteMindmapBackupByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteMindmapBackupById);
    }

    /**
     * 根据id删除脑图备份V2
     *
     * 根据id删除脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapBackupByIdRequest 请求对象
     * @return SyncInvoker<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse>
     */
    public SyncInvoker<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse> deleteMindmapBackupByIdInvoker(
        DeleteMindmapBackupByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteMindmapBackupById, hcClient);
    }

    /**
     * 删除脑图回收站V2
     *
     * 删除脑图回收站V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapRecycleByIdRequest 请求对象
     * @return DeleteMindmapRecycleByIdResponse
     */
    public DeleteMindmapRecycleByIdResponse deleteMindmapRecycleById(DeleteMindmapRecycleByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteMindmapRecycleById);
    }

    /**
     * 删除脑图回收站V2
     *
     * 删除脑图回收站V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapRecycleByIdRequest 请求对象
     * @return SyncInvoker<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse>
     */
    public SyncInvoker<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse> deleteMindmapRecycleByIdInvoker(
        DeleteMindmapRecycleByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteMindmapRecycleById, hcClient);
    }

    /**
     * 删除模板V2
     *
     * 删除模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateByIdRequest 请求对象
     * @return DeleteTemplateByIdResponse
     */
    public DeleteTemplateByIdResponse deleteTemplateById(DeleteTemplateByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteTemplateById);
    }

    /**
     * 删除模板V2
     *
     * 删除模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateByIdRequest 请求对象
     * @return SyncInvoker<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse>
     */
    public SyncInvoker<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse> deleteTemplateByIdInvoker(
        DeleteTemplateByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteTemplateById, hcClient);
    }

    /**
     * 下载资产模板
     *
     * 下载资产模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetTemplateRequest 请求对象
     * @return DownloadAssetTemplateResponse
     */
    public DownloadAssetTemplateResponse downloadAssetTemplate(DownloadAssetTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.downloadAssetTemplate);
    }

    /**
     * 下载资产模板
     *
     * 下载资产模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetTemplateRequest 请求对象
     * @return SyncInvoker<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse>
     */
    public SyncInvoker<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse> downloadAssetTemplateInvoker(
        DownloadAssetTemplateRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.downloadAssetTemplate, hcClient);
    }

    /**
     * 因子库导出
     *
     * 因子库导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFactorRequest 请求对象
     * @return ExportFactorResponse
     */
    public ExportFactorResponse exportFactor(ExportFactorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.exportFactor);
    }

    /**
     * 因子库导出
     *
     * 因子库导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFactorRequest 请求对象
     * @return SyncInvoker<ExportFactorRequest, ExportFactorResponse>
     */
    public SyncInvoker<ExportFactorRequest, ExportFactorResponse> exportFactorInvoker(ExportFactorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.exportFactor, hcClient);
    }

    /**
     * 资产导入
     *
     * 资产导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAssetRequest 请求对象
     * @return ImportAssetResponse
     */
    public ImportAssetResponse importAsset(ImportAssetRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.importAsset);
    }

    /**
     * 资产导入
     *
     * 资产导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAssetRequest 请求对象
     * @return SyncInvoker<ImportAssetRequest, ImportAssetResponse>
     */
    public SyncInvoker<ImportAssetRequest, ImportAssetResponse> importAssetInvoker(ImportAssetRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.importAsset, hcClient);
    }

    /**
     * 因子导入
     *
     * 因子导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportFactorRequest 请求对象
     * @return ImportFactorResponse
     */
    public ImportFactorResponse importFactor(ImportFactorRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.importFactor);
    }

    /**
     * 因子导入
     *
     * 因子导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportFactorRequest 请求对象
     * @return SyncInvoker<ImportFactorRequest, ImportFactorResponse>
     */
    public SyncInvoker<ImportFactorRequest, ImportFactorResponse> importFactorInvoker(ImportFactorRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.importFactor, hcClient);
    }

    /**
     * 获取默认模板V2
     *
     * 获取默认模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultTemplateByPageRequest 请求对象
     * @return ShowDefaultTemplateByPageResponse
     */
    public ShowDefaultTemplateByPageResponse showDefaultTemplateByPage(ShowDefaultTemplateByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showDefaultTemplateByPage);
    }

    /**
     * 获取默认模板V2
     *
     * 获取默认模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultTemplateByPageRequest 请求对象
     * @return SyncInvoker<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse>
     */
    public SyncInvoker<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse> showDefaultTemplateByPageInvoker(
        ShowDefaultTemplateByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showDefaultTemplateByPage, hcClient);
    }

    /**
     * 根据id获取脑图备份V2
     *
     * 根据id获取脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByIdRequest 请求对象
     * @return ShowMindmapBackupByIdResponse
     */
    public ShowMindmapBackupByIdResponse showMindmapBackupById(ShowMindmapBackupByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapBackupById);
    }

    /**
     * 根据id获取脑图备份V2
     *
     * 根据id获取脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByIdRequest 请求对象
     * @return SyncInvoker<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse>
     */
    public SyncInvoker<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse> showMindmapBackupByIdInvoker(
        ShowMindmapBackupByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapBackupById, hcClient);
    }

    /**
     * 根据条件分页获取脑图备份对象V3
     *
     * 根据条件分页获取脑图备份对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByPageRequest 请求对象
     * @return ShowMindmapBackupByPageResponse
     */
    public ShowMindmapBackupByPageResponse showMindmapBackupByPage(ShowMindmapBackupByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapBackupByPage);
    }

    /**
     * 根据条件分页获取脑图备份对象V3
     *
     * 根据条件分页获取脑图备份对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByPageRequest 请求对象
     * @return SyncInvoker<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse>
     */
    public SyncInvoker<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse> showMindmapBackupByPageInvoker(
        ShowMindmapBackupByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapBackupByPage, hcClient);
    }

    /**
     * 根据id获取回收站脑图对象V2
     *
     * 根据id获取回收站脑图对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByIdRequest 请求对象
     * @return ShowMindmapRecycleByIdResponse
     */
    public ShowMindmapRecycleByIdResponse showMindmapRecycleById(ShowMindmapRecycleByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapRecycleById);
    }

    /**
     * 根据id获取回收站脑图对象V2
     *
     * 根据id获取回收站脑图对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByIdRequest 请求对象
     * @return SyncInvoker<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse>
     */
    public SyncInvoker<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse> showMindmapRecycleByIdInvoker(
        ShowMindmapRecycleByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapRecycleById, hcClient);
    }

    /**
     * 根据条件分页获取回收站脑图对象V3
     *
     * 根据条件分页获取回收站脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByPageRequest 请求对象
     * @return ShowMindmapRecycleByPageResponse
     */
    public ShowMindmapRecycleByPageResponse showMindmapRecycleByPage(ShowMindmapRecycleByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapRecycleByPage);
    }

    /**
     * 根据条件分页获取回收站脑图对象V3
     *
     * 根据条件分页获取回收站脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByPageRequest 请求对象
     * @return SyncInvoker<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse>
     */
    public SyncInvoker<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse> showMindmapRecycleByPageInvoker(
        ShowMindmapRecycleByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapRecycleByPage, hcClient);
    }

    /**
     * 根据id获取测试用例对象V2
     *
     * 根据id获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByIdRequest 请求对象
     * @return ShowTestcaseByIdResponse
     */
    public ShowTestcaseByIdResponse showTestcaseById(ShowTestcaseByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestcaseById);
    }

    /**
     * 根据id获取测试用例对象V2
     *
     * 根据id获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByIdRequest 请求对象
     * @return SyncInvoker<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse>
     */
    public SyncInvoker<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse> showTestcaseByIdInvoker(
        ShowTestcaseByIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestcaseById, hcClient);
    }

    /**
     * 修改资产树节点
     *
     * 修改资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetTreeRequest 请求对象
     * @return UpdateAssetTreeResponse
     */
    public UpdateAssetTreeResponse updateAssetTree(UpdateAssetTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateAssetTree);
    }

    /**
     * 修改资产树节点
     *
     * 修改资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetTreeRequest 请求对象
     * @return SyncInvoker<UpdateAssetTreeRequest, UpdateAssetTreeResponse>
     */
    public SyncInvoker<UpdateAssetTreeRequest, UpdateAssetTreeResponse> updateAssetTreeInvoker(
        UpdateAssetTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateAssetTree, hcClient);
    }

    /**
     * 脑图名称编辑
     *
     * 脑图名称编辑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMindmapNameRequest 请求对象
     * @return UpdateMindmapNameResponse
     */
    public UpdateMindmapNameResponse updateMindmapName(UpdateMindmapNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateMindmapName);
    }

    /**
     * 脑图名称编辑
     *
     * 脑图名称编辑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMindmapNameRequest 请求对象
     * @return SyncInvoker<UpdateMindmapNameRequest, UpdateMindmapNameResponse>
     */
    public SyncInvoker<UpdateMindmapNameRequest, UpdateMindmapNameResponse> updateMindmapNameInvoker(
        UpdateMindmapNameRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateMindmapName, hcClient);
    }

}
