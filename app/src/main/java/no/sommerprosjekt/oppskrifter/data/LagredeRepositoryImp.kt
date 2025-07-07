package no.sommerprosjekt.oppskrifter.data

import android.util.Log
import kotlinx.coroutines.flow.StateFlow
import no.sommerprosjekt.oppskrifter.domain.LagredeRepository
import no.sommerprosjekt.oppskrifter.model.Oppskrift

class LagredeRepositoryImp () : LagredeRepository {
    init{}
    override fun getLagredeFlow() : StateFlow<List<Oppskrift>> {
        TODO()
    }
}
