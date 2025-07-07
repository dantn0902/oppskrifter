package no.sommerprosjekt.oppskrifter.domain

import kotlinx.coroutines.flow.StateFlow
import no.sommerprosjekt.oppskrifter.model.Oppskrift

interface LagredeRepository {
    /**
     * henter liste med lagrede oppskrifter
     */
    fun getLagredeFlow() : StateFlow<List<Oppskrift>>
}
