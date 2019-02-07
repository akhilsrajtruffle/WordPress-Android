package org.wordpress.android.ui.stats.refresh

import kotlinx.coroutines.CoroutineDispatcher
import org.wordpress.android.modules.UI_THREAD
import org.wordpress.android.ui.stats.refresh.lists.BaseListUseCase
import javax.inject.Inject
import javax.inject.Named

class StatsViewAllCommentsViewModel
@Inject constructor(
    @Named(UI_THREAD) mainDispatcher: CoroutineDispatcher,
    @Named(VIEW_ALL_COMMENTS_USE_CASE) useCase: BaseListUseCase
) : StatsViewAllViewModel(mainDispatcher, useCase)
