import { TestBed } from '@angular/core/testing';

import { ArtesaoService } from './artesao.service';

describe('ArtesaoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ArtesaoService = TestBed.get(ArtesaoService);
    expect(service).toBeTruthy();
  });
});
