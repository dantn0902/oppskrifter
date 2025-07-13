package no.sommerprosjekt.oppskrifter.data

import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import no.sommerprosjekt.oppskrifter.domain.LagredeRepository
import no.sommerprosjekt.oppskrifter.model.Oppskrift

class LagredeRepositoryImp () : LagredeRepository {
    init{}
    private val lagredeStateFlow = MutableStateFlow<List<Oppskrift>>(listOf())

    override fun getLagrede() : StateFlow<List<Oppskrift>> = lagredeStateFlow.asStateFlow()
}
